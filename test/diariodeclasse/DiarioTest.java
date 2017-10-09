/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class DiarioTest {
    
    private Diario diario;
    private Aluno aluno;
    
    public DiarioTest() {
        diario = new Diario("Programacao I");
    }

    /**
     * Test of addAluno method, of class Diario.
     */
    @Test
    public void testAddAluno() {
        System.out.println("addAluno");
        Aluno aluno = null;
        Diario instance = null;
        instance.addAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExame method, of class Diario.
     */
    @Test
    public void testAddExame() {
        System.out.println("addExame");
        Exame exame = null;
        Diario instance = null;
        instance.addExame(exame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotasAluno method, of class Diario.
     */
    @Test
    public void testGetNotasAluno() {
        System.out.println("getNotasAluno");
        int matricula = 0;
        Diario instance = null;
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = instance.getNotasAluno(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiario method, of class Diario.
     */
    @Test
    public void testGetDiario() {
        System.out.println("getDiario");
        Diario instance = diario;
        HashMap<Integer, ArrayList<Exame>> expResult = null;
        HashMap<Integer, ArrayList<Exame>> result = instance.getDiario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisciplina method, of class Diario.
     */
    @Test
    public void testGetDisciplina() {
        System.out.println("getDisciplina");
        Diario instance = diario;
        String expResult = "Programacao I";
        String result = instance.getDisciplina();
        assertEquals(expResult, result);
        
    }
    
}
