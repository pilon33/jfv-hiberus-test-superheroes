package jfv.hiberus.superheroes.challenge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SEXO")
public class Sexo implements Serializable {

	private static final long serialVersionUID = 8607497794512854034L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "NOMBRE", nullable = false, length = 250)
	private String nombre;

	public Sexo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Sexo(Integer id) {
		super();
		this.id = id;
	}
	
}
