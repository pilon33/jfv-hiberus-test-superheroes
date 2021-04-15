package jfv.hiberus.superheroes.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jfv.hiberus.superheroes.challenge.entity.OrigenPoder;

public interface OrigenPoderRepository extends JpaRepository<OrigenPoder, Integer> {

	OrigenPoder findByDescripcion(String descripcion);
}
