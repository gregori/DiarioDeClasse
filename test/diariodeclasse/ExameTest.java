/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class ExameTest {
    
    private Exame exame;
    private Aluno aluno;
    
    public ExameTest() {
        aluno = new Aluno("Fulano", 1234, "01/01/1900");
        exame = new Exame(aluno, "28/09/2017", 6.0);
    }

    /**
     * Test of getAluno method, of class Exame.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        
        Aluno expResult = aluno;
        Aluno result = exame.getAluno();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getData method, of class Exame.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        
        String expResult = "28/09/2017";
        String result = exame.getData();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNota method, of class Exame.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        
        double expResult = 6.0;
        double result = exame.getNota();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
