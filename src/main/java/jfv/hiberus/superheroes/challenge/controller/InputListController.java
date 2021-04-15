package jfv.hiberus.superheroes.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jfv.hiberus.superheroes.challenge.model.InputListValue;
import jfv.hiberus.superheroes.challenge.services.InputListService;

@RestController
@RequestMapping("/inputList")
public class InputListController {
	
	@Autowired
	private InputListService inputListService;
	
	@GetMapping("/getOrigenesPoder")
	public ResponseEntity<List<InputListValue>> getOrigenPoder() {
		return ResponseEntity.ok(inputListService.getOrigenPoderInputList());
	}
	
	@GetMapping("/getSexo")
	public ResponseEntity<List<InputListValue>> getSexo() {
		return ResponseEntity.ok(inputListService.getSexoInputList());
	}
}
