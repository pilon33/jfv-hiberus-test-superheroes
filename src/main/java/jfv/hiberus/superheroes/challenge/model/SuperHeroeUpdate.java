package jfv.hiberus.superheroes.challenge.model;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuperHeroeUpdate {
	
	private Integer id;
	private String nombre;
	private Integer edad;
	private String puedeVolar;
	private String profesion;
	private Integer origenPoderId;
	private Integer sexoId;
	
}

