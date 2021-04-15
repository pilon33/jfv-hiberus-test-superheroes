package jfv.hiberus.superheroes.challenge.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import jfv.hiberus.superheroes.challenge.entity.SuperHeroe;
import jfv.hiberus.superheroes.challenge.model.SuperHeroeDTO;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface SuperHeroeMapper {
	
	@Mapping(target = "origenPoder", source = "superHeroe.origenPoder.descripcion")
	@Mapping(target = "sexo", source = "superHeroe.sexo.nombre")
	SuperHeroeDTO toSuperHeroe(SuperHeroe superHeroe);
	List<SuperHeroeDTO> toSuperHeroe(List<SuperHeroe> listaSuperHeroes);
}
