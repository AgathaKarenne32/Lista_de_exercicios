/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno.java;

/**
 *
 * @author kesia.viana
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String matricula;
    private double nota;

   
    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

   
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para determinar o conceito baseado na nota
    public String Conceito() {
        if (nota >= 0.0 && nota <= 4.9) {
            return "D";
        } else if (nota >= 5.0 && nota <= 6.9) {
            return "C";
        } else if (nota >= 7.0 && nota <= 8.9) {
            return "B";
        } else if (nota >= 9.0 && nota <= 10.0) {
            return "A";
        } else {
            return "Nota inválida";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o número de matrícula do aluno: ");
            String matricula = scanner.nextLine();

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consome o '\n' após o número

            Aluno aluno = new Aluno(matricula, nota);
            alunos.add(aluno);

            System.out.print("Deseja adicionar outro aluno? (s/n): ");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("s");
        }

        System.out.println("\nConceitos Finais dos Alunos:");
        for (Aluno aluno : alunos) {
            System.out.printf("Matrícula: %s, Nota: %.1f, Conceito: %s%n", aluno.getMatricula(), aluno.getNota(), aluno.Conceito());
        }

        scanner.close();
    }
}
