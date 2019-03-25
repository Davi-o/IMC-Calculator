package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Davi Alves
 * @since 25/03/2019
 * @version 1.0
 */
public class PessoaTest {
    private static final Pessoa p = new Pessoa();
    
    public PessoaTest() { }
    
    @BeforeClass
    public static void setUpClass() { }
    
    @AfterClass
    public static void tearDownClass() { }
    
    @Before
    public void setUp() {
        p.setNome("Maria");
        p.setSexo("Feminino");
        p.setAltura(170);
        p.setPeso(80);
        p.setPercentGordura(16.5);
        p.setIdade(20);
    }
    
    @After
    public void tearDown() { }

    /**
     * Teste mostrar resultado da classe pessoa, metodo que retorna os calculos
     */
    @Test
    public void testMostrarResultados() {
        assertEquals("Nome: Maria\n" +
                     "Sexo: Feminino\n" +
                     "Idade: 20 anos\n" +
                     "Altura: 170\n" +
                     "Peso atual: 80.0\n" +
                     "Você está 10.0Kg de diferença do seu peso ideal.\n" +
                     "Antigo IMC: 0.002768166089965398\n" +
                     "Novo IMC: 1.8", p.mostrarResultados());
    }// fazer os metodos publicos e testar individualmente
}
