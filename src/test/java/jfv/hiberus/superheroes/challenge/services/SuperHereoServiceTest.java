package jfv.hiberus.superheroes.challenge.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jfv.hiberus.superheroes.challenge.services.SuperHeroeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SuperHereoServiceTest {
	
	@Autowired
	private SuperHeroeService superHeroeService;
	
    @Test
    void buscarPorIdTest() {
    	assertEquals("Magneto", superHeroeService.getSuperHeroeById(2).getNombre());
    }

}
