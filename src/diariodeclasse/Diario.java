/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class Diario {
    private HashMap<Integer, Aluno> alunos;
    private HashMap<Integer, ArrayList<Exame>> exames;
    private String disciplina;

    /**
     * Constrói um diário de classe para uma disciplina.
     * @param disciplina
     */
    public Diario(String disciplina) {
        this.disciplina = disciplina;
        alunos = new HashMap<>();
        exames = new HashMap<>();
    }
    
    /**
     * Adiciona um aluno à lista de alunos do diário.
     * @param aluno
     */
    public void addAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }
    
    /**
     * Adiciona um exame ao diário.
     * @param exame
     */
    public void addExame(Exame exame) {
        int matricula = exame.getAluno().getMatricula();
        
        if (!exames.containsKey(matricula)) {
            exames.put(matricula, new ArrayList<>());
        }
        
        exames.get(matricula).add(exame);
    }
    
    /**
     *
     * @return
     */
    public HashMap<Integer, Aluno> getAlunos() {
        return alunos;
    }
    
    /**
     * Retorna um aluno, a partir da sua matrícula.
     * @param matricula a matrícula do aluno
     * @return O aluno
     */
    public Aluno getAluno(int matricula) {
        return alunos.get(matricula);
    }
    
    /**
     * Obtém as notas de um aluno, a partir de sua matrícula
     * @param matricula A matrícula do aluno.
     * @return Um ArrayList com as notas do aluno.
     */
    public ArrayList<Double> getNotasAluno(int matricula) {
        ArrayList<Double> notas = new ArrayList<>();
        
        for (Exame exame : exames.get(matricula)) {
            notas.add(exame.getNota());
        }
        
        return notas;
    }
    
    /**
     * Retorna todos os dados do diário de classe.
     * @return Um ArrayList com todos os dados do diário
     */
    public HashMap<Integer, ArrayList<Exame>> getDiario() {
        return exames;
    }
    
    /**
     * Retorna o nome da disciplina, à qual este diário de classe pertence.
     * @return O nome da disciplina.
     */
    public String getDisciplina() {
        return disciplina;
    }
    
    
}
