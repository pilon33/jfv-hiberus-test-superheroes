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
@Table(name = "ORIGEN_PODER")
public class OrigenPoder implements Serializable {
	
	private static final long serialVersionUID = -2298439770234897100L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;

	@Column(name = "DESCRIPCION", nullable = false, length = 250)
	private String descripcion;

	public OrigenPoder(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public OrigenPoder(Integer id) {
		super();
		this.id = id;
	}
	
}
