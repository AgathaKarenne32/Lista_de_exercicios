/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author Villalba
 */

//Crie uma classe para representar uma pessoa
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
  // com os atributos privados de nome, data de nascimento e altura.  
    private String nome;
    private LocalDate dataNascimento;
    private Double altura;
    
    public Pessoa(String nome, Double altura, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        
    }
    //necessários para gets
    public String getNome(){
        return nome;
    }
    //  Crie os métodos públicos necessários para sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(Double altura){
         this.altura=altura;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    // Crie um metodo para imprimir todos os dados da pessoa
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Idade: " + calcularIdade() + "anos");
    }
    // Crie um método para calcular a idade da pessoa
     public int calcularIdade() {
        LocalDate hoje = LocalDate.now(); 
        return Period.between(this.dataNascimento, hoje).getYears(); 
    }
    
    //e também um método para imprimir todos dados de uma pessoa.
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Antonio", 1.75, LocalDate.of(1969,10,6));
        pessoa.imprimirDados();

    }
}
