/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
    private Double altura;
    private LocalDate dataNascimento;
    
    public Pessoa(String nome, Double altura, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        
    }
    //necessários para gets
    public String getNome(){
        return nome;
    }
    public double getAltura(){
        return altura;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    //  Crie os métodos públicos necessários para sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAltura(Double altura){
         this.altura=altura;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    // Crie um método para calcular a idade da pessoa
     public int calcularIdade() {
        LocalDate hoje = LocalDate.now(); 
        return Period.between(this.dataNascimento, hoje).getYears(); 
    }
    
    //e também um método para imprimir todos dados de uma pessoa.
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Antonio", 1.75, LocalDate.of(1969,10,6));
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println(""+ pessoa.getNome() + " tem " + pessoa.calcularIdade() + " anos!!!");
         
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("                          DADOS ATUALIZADOS                           ");
        System.out.println("+--------------------------------------------------------------------+");
        pessoa.setNome("Hilda");
        System.out.println("Nome alterado: " + pessoa.getNome());
        pessoa.setAltura(1.59);
        System.out.println("Altura alterada: " + pessoa.getAltura());
        pessoa.setDataNascimento(LocalDate.of(2002, 9, 23));
        System.out.println("Data de Nascimento alterada: " + pessoa.getDataNascimento());
        System.out.println(""+ pessoa.getNome() + " tem " + pessoa.calcularIdade() + " anos!!!");
        System.out.println("--------------------------------------------------------------------");

    }
}
