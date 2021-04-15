package jfv.hiberus.superheroes.challenge.repository;

import java.util.List;

import jfv.hiberus.superheroes.challenge.model.SuperHeroeDTO;

public interface SuperHereoCustomRepository {

	List<SuperHeroeDTO> getSuperHeroesByParam(String param);
}
