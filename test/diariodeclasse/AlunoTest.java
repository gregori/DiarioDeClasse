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
public class AlunoTest {
    
    private Aluno aluno;
    
    public AlunoTest() {
        aluno = new Aluno("Fulano", 1234, "01/01/1900");
    }

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        
        String expResult = "Fulano";
        String result = aluno.getNome();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        
        int expResult = 1234;
        int result = aluno.getMatricula();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDataNascimento method, of class Aluno.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        
        String expResult = "01/01/1900";
        String result = aluno.getDataNascimento();
        assertEquals(expResult, result);
        
    }
    
}
