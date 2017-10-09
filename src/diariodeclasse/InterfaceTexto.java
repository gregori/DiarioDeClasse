/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class InterfaceTexto {
    private Diario diario;
    private Scanner reader;

    public InterfaceTexto() {
        reader = new Scanner(System.in);
        reader.useDelimiter("\\n");
    }
    
    public void executa() {
        boolean sair = false;
        
        inicializaDiario();
        
        while (!sair) {
            String opcao = imprimeMenu();
            
            switch (opcao) {
                case "1":
                    cadastrarAluno();
                    break;
                case "2":
                    cadastrarExame();
                    break;
                case "3":
                    listarNotas();
                    break;
                case "4":
                    mostrarDiario();
                    break;
                case "s":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;  
            }
        }
    }
    
    private void inicializaDiario() {
        System.out.println("Diário de Classe");
        System.out.println();
        System.out.print("Entre o nome da disciplina: ");
        String disciplina = reader.next();
        
        diario = new Diario(disciplina);
    }
    
    private String imprimeMenu() {
        //clearScreen();
        System.out.println("-----------------------------------");
        System.out.println("Diário de Classe");
        System.out.println();
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Exame");
        System.out.println("3 - Listar notas do Aluno");
        System.out.println("4 - Mostrar diário");
        System.out.println("S - Sair");
        System.out.println();
                
        System.out.print("Escolha: ");
        
        return reader.next().toLowerCase();
    }
    
    private void cadastrarAluno() {
        System.out.println("Cadastro de Aluno");
        System.out.print("Entre o nome do aluno: ");
        String nome = reader.next();
        System.out.print("Entre a matrícula do aluno: ");
        int matricula = reader.nextInt();
        System.out.print("Entre a data de nascimento do aluno: ");
        String dataNascimento = reader.next();
        
        diario.addAluno(new Aluno(nome, matricula, dataNascimento));
    }
    
    private void cadastrarExame() {
        System.out.println("Cadastro de Exame");
        System.out.println();
        listarAlunos();
        System.out.println();
        int matricula = getMatriculaAluno();
        System.out.print("Entre a data do exame: ");
        String data = reader.next();
        System.out.print("Entre a nota: ");
        double nota = reader.nextDouble();
        
        diario.addExame(new Exame(diario.getAlunos().get(matricula), data, nota));
    }
    
    private int getMatriculaAluno() {
        System.out.print("Entre a matrícula do aluno: ");
        return reader.nextInt();
    }
    
    private void listarAlunos() {
        System.out.println("Alunos");
        
        for (Aluno aluno : diario.getAlunos().values()) {
            System.out.println(aluno.getMatricula() + " - " + aluno.getNome());
        }
    }
    
    private void listarNotas() {
        System.out.println("Listagem de notas");
        System.out.println();
        listarAlunos();
        System.out.println();
        int matricula = getMatriculaAluno();
        System.out.println("Notas para o aluno: " + diario.getAluno(matricula).getNome());
        System.out.println();
        
        for (double nota : diario.getNotasAluno(matricula)) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }
    
    private void mostrarDiario() {
        System.out.println("Diário de Classe");
        System.out.println("Disciplina: " + diario.getDisciplina());
        for (ArrayList<Exame> exames : diario.getDiario().values()) {
            System.out.print(exames.get(0).getAluno().getNome() + "\t");
            for(Exame exame : exames) {
                System.out.print(exame.getNota() + "(" + exame.getData() + ")\t");
            }
            System.out.println();
        }
    }
    
}
