package jfv.hiberus.superheroes.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jfv.hiberus.superheroes.challenge.entity.SuperHeroe;

public interface SuperHeroeRepository extends JpaRepository<SuperHeroe, Integer>, SuperHereoCustomRepository {

}
