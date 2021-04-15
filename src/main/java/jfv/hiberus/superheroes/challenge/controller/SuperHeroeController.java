package jfv.hiberus.superheroes.challenge.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jfv.hiberus.superheroes.challenge.model.SuperHeroeDTO;
import jfv.hiberus.superheroes.challenge.model.SuperHeroeUpdate;
import jfv.hiberus.superheroes.challenge.services.SuperHeroeService;

@RestController
@RequestMapping("/superheroes")
public class SuperHeroeController {
	
	@Autowired
	private SuperHeroeService superHeroeService;
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/getSuperHeroes")
	public ResponseEntity<List<SuperHeroeDTO>> getSuperHeroes() {
		return ResponseEntity.ok(superHeroeService.getAllSuperHeroes());
	}
	
	@GetMapping("/getSuperHeroe/{id}")
	@Cacheable(value = "superHeroe",key="#id")
	public ResponseEntity<SuperHeroeDTO> getSuperHeroeById(@PathVariable Integer id){
		return ResponseEntity.ok(superHeroeService.getSuperHeroeById(id));
	}
	
	@GetMapping("/getSuperHeroeByParam/{param}")
	public ResponseEntity<List<SuperHeroeDTO>> getSuperHeroeByParam(@PathVariable String param) {
		return ResponseEntity.ok(superHeroeService.getAllSuperHeroesByParam(param));
	}
	
	@DeleteMapping("/admin/eliminarSuperHereo/{id}")
	@CacheEvict(value = "superHeroe",allEntries = false,key = "#id")
	public ResponseEntity<Boolean> deleteByParam(@PathVariable Integer id) {
		return ResponseEntity.ok(superHeroeService.deleteByParam(id));
	}
	
	@PutMapping("/admin/actualizarSuperHereo")
	public ResponseEntity<Boolean> updateSuperHereo(@Valid @RequestBody SuperHeroeUpdate superHeroeUpdate) {
		return ResponseEntity.ok(superHeroeService.updateSuperHeroe(superHeroeUpdate));
	}

}
