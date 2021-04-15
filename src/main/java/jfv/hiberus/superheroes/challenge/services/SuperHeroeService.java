package jfv.hiberus.superheroes.challenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import jfv.hiberus.superheroes.challenge.aop.LogExecutionTime;
import jfv.hiberus.superheroes.challenge.entity.OrigenPoder;
import jfv.hiberus.superheroes.challenge.entity.Sexo;
import jfv.hiberus.superheroes.challenge.entity.SuperHeroe;
import jfv.hiberus.superheroes.challenge.mapper.SuperHeroeMapper;
import jfv.hiberus.superheroes.challenge.model.SuperHeroeDTO;
import jfv.hiberus.superheroes.challenge.model.SuperHeroeUpdate;
import jfv.hiberus.superheroes.challenge.repository.SuperHeroeRepository;

@Service
@Transactional(readOnly = true)
public class SuperHeroeService {
	
	@Autowired
	private SuperHeroeRepository superHeroeRepository;
	
	@Autowired
	private SuperHeroeMapper superHeroeMapper;
	
	
	
	/**
	 * @descripcion Update heroe
	 * @param 
	 * @return update (true||false)
	 */
	@Transactional()
	public boolean updateSuperHeroe(SuperHeroeUpdate superHeroeUpdate) {
		boolean actualizado = true;
		SuperHeroe superHereoBD = superHeroeRepository.findById(superHeroeUpdate.getId()).orElse(null);
		if(!ObjectUtils.isEmpty(superHereoBD)) {
			superHereoBD.setSexo(new Sexo(superHeroeUpdate.getSexoId()));
			superHereoBD.setNombre(superHeroeUpdate.getNombre());
			superHereoBD.setEdad(superHeroeUpdate.getEdad());
			superHereoBD.setProfesion(superHeroeUpdate.getProfesion());
			superHereoBD.setPuedeVolar(superHeroeUpdate.getPuedeVolar());
			superHereoBD.setOrigenPoder(new OrigenPoder(superHeroeUpdate.getOrigenPoderId()));
			superHeroeRepository.save(superHereoBD);
		}
		return actualizado;
	}
	
	/**
	 * 
	 * @return getAll
	 */
	@LogExecutionTime
	public List<SuperHeroeDTO> getAllSuperHeroes(){
		return superHeroeMapper.toSuperHeroe(superHeroeRepository.findAll());
	}
	
	/**
	 * 
	 * @param id
	 * @return superHeroe
	 */
	public SuperHeroeDTO getSuperHeroeById(Integer id){
		return superHeroeMapper.toSuperHeroe(superHeroeRepository.findById(id).orElse(null));
	}
	
	/**
	 * @descripcion delete SuperHeroe
	 * @param id
	 * @return delete (true||false)
	 */
	@Transactional()
	public boolean deleteByParam(Integer id) {
		boolean eliminado = true;
		superHeroeRepository.deleteById(id);
		if(superHeroeRepository.findById(id).isPresent()) {
			eliminado=false;
		}
		return eliminado;
	}
	
	/**
	 * @descripcion  search get(param)
	 * @param parameter 
	 * @return list SuperHeroe
	 */
	public List<SuperHeroeDTO> getAllSuperHeroesByParam(String parameter) {
		return superHeroeRepository.getSuperHeroesByParam(parameter);
	}
		
}
