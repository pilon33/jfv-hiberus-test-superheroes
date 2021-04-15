package jfv.hiberus.superheroes.challenge.services;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jfv.hiberus.superheroes.challenge.services.InputListService;

@RunWith(SpringRunner.class)
@SpringBootTest
class InputListServiceTest {

	@Autowired
	private InputListService inputListService;
	
	@Test
	void getSexuInputListTest() {
		assertNotNull(inputListService.getSexoInputList());
	}
	
	@Test
	void getOrigenPoderInputList() {
		assertNotNull(inputListService.getOrigenPoderInputList());
	}
}
