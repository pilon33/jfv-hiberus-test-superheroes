package jfv.hiberus.superheroes.challenge.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import jfv.hiberus.superheroes.challenge.model.SuperHeroeDTO;
import jfv.hiberus.superheroes.challenge.repository.SuperHereoCustomRepository;

public class SuperHereoCustomRepositoryImpl implements SuperHereoCustomRepository {
	
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<SuperHeroeDTO> getSuperHeroesByParam(String parameter){
    	StringBuilder querySB = new StringBuilder();
    	querySB.append(" SELECT new jfv.hiberus.superheroes.challenge.model.SuperHeroeDTO (");
    	querySB.append(" s.id,");
    	querySB.append(" s.nombre,");
    	querySB.append(" s.edad,");
    	querySB.append(" s.profesion,");
    	querySB.append(" s.puedeVolar,");
    	querySB.append(" t.descripcion,");
    	querySB.append(" g.nombre )");
    	querySB.append(" FROM SuperHeroe s"
    				 + " LEFT JOIN s.sexo g "
    				 + " LEFT JOIN s.origenPoder t");
    	if(!parameter.isEmpty()) {
    		querySB.append(" WHERE UPPER(s.nombre) LIKE :parameter");
    	}
		TypedQuery<SuperHeroeDTO> query = entityManager.createQuery(querySB.toString(), SuperHeroeDTO.class);
      	if(!parameter.isEmpty()) {
      		query.setParameter("parameter", "%"+parameter.toUpperCase()+"%");
    	}
      	return query.getResultList();
		
    }
}
