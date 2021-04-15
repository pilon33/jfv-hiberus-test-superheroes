package jfv.hiberus.superheroes.challenge.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jfv.hiberus.superheroes.challenge.entity.OrigenPoder;
import jfv.hiberus.superheroes.challenge.entity.Sexo;
import jfv.hiberus.superheroes.challenge.model.InputListValue;
import jfv.hiberus.superheroes.challenge.repository.OrigenPoderRepository;
import jfv.hiberus.superheroes.challenge.repository.SexoRepository;

@Service
@Transactional(readOnly = true)
public class InputListService {
	
	@Autowired
	private SexoRepository sexoRepository;
	
	@Autowired
	private OrigenPoderRepository origenPoderRepository;
	
	/**
	 * @return list carga inputList sexo
	 */
	public List<InputListValue> getSexoInputList() {
		List<Sexo> sexoList = sexoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
		if (!sexoList.isEmpty()) {
			return sexoList.stream()
					.map(sexo -> new InputListValue(sexo.getId(), sexo.getNombre()))
					.collect(Collectors.toList());
		}
		return new ArrayList<>();
	}
	
	/**
	 * @return  list carga inputList origenPoder
	 */
	public List<InputListValue> getOrigenPoderInputList(){
		List<OrigenPoder> origenPoderList = origenPoderRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
		if (!origenPoderList.isEmpty()) {
			return origenPoderList.stream()
					.map(origenPoder -> new InputListValue(origenPoder.getId(), origenPoder.getDescripcion()))
					.collect(Collectors.toList());
		}
		return new ArrayList<>();
	}
}
