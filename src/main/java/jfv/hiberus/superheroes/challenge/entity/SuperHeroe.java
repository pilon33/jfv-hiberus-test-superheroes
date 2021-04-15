package jfv.hiberus.superheroes.challenge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SUPER_HEROE")
public class SuperHeroe implements Serializable{
	
	private static final long serialVersionUID = 7297093927025037981L;

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "NOMBRE", nullable = false, length = 250)
	private String nombre;
	
	@Column(name = "EDAD")
	private Integer edad;
	
	@Column(name = "PUEDE_VOLAR",length = 250)
	private String puedeVolar;

	@Column(name = "PROFESION", length = 250)
	private String profesion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORIGEN_PODER_ID")
	private OrigenPoder origenPoder;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SEXO_ID")
	private Sexo sexo;
}
