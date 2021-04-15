package jfv.hiberus.superheroes.challenge.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jfv.hiberus.superheroes.challenge.entity.OrigenPoder;
import jfv.hiberus.superheroes.challenge.entity.Sexo;
import jfv.hiberus.superheroes.challenge.entity.SuperHeroe;
import jfv.hiberus.superheroes.challenge.repository.OrigenPoderRepository;
import jfv.hiberus.superheroes.challenge.repository.SexoRepository;
import jfv.hiberus.superheroes.challenge.repository.SuperHeroeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJPAIntegrationTest {

	
	@Autowired
	private SuperHeroeRepository superHeroeRepository;
	
	@Autowired
	private OrigenPoderRepository origenPoderRepository;
	
	@Autowired
	private SexoRepository sexoRepository;
	
    @Test
    void superHeroeEntityIntegrationTest() {
    	SuperHeroe superHeroe = superHeroeRepository.save(
    			new SuperHeroe(11,"hombre lobo",34,"no","Maestro",new OrigenPoder(2), new Sexo(2)));
    	SuperHeroe superHeroeBD = superHeroeRepository.findById(superHeroe.getId()).orElse(null);
 
        assertNotNull(superHeroeBD);
        assertEquals(superHeroe.getId(), superHeroeBD.getId());
    } 
    
    @Test
    void origenPoderEntityIntegrationTest() {
    	OrigenPoder tipoNuevo = origenPoderRepository.save(new OrigenPoder("Neutral"));
    	OrigenPoder tipoBD = origenPoderRepository.findByDescripcion("Neutral");
    	 assertNotNull(tipoBD);
    	 assertEquals(tipoNuevo.getId(),tipoBD.getId());
    }
    
    @Test
    void sexoEntityIntegrationTest() {
    	Sexo sexoNuevo = sexoRepository.save(new Sexo("Desconocido"));
    	Sexo sexoBD = sexoRepository.findByNombre("Desconocido");
    	assertNotNull(sexoBD);
    	assertEquals(sexoNuevo.getId(),sexoBD.getId());
    }
    
}
