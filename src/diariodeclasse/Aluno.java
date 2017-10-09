/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

/**
 *
 * @author rodrigo
 */
public class Aluno {
    private String nome;
    private int matricula;
    private String dataNascimento;
    
    public Aluno(String nome, int matricula, String dataNascimento)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
}
