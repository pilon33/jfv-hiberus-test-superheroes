package jfv.hiberus.superheroes.challenge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuperHeroeDTO {
	
	private Integer id;
	private String nombre;
	private Integer edad;
	private String puedeVolar;
	private String profesion;
	private String origenPoder;
	private String sexo;
	
}
