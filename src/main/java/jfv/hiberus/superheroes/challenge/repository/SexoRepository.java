package jfv.hiberus.superheroes.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jfv.hiberus.superheroes.challenge.entity.Sexo;

public interface SexoRepository extends JpaRepository<Sexo, Integer> {

	Sexo findByNombre(String nombre);
}
