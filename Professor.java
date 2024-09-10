/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package professor;

/**
 *
 * @author Agatha
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor {
    private String nome;         // Nome do professor
    private String cpf;          // CPF do professor
    private String titulacao;    // Titulação acadêmica do professor (ex.: especialista, mestre, doutor)
    private double salario;      // Salário do professor
    
    // Construtor da classe Professor para inicializar os atributos com os valores fornecidos
    public Professor(String nome, String cpf, String titulacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.salario = salario;
    }
    
    // Método privado que determina a taxa de contribuição com base na titulação do professor
    private double obterTaxaContribuicao() {
        // Verifica a titulação do professor e retorna a taxa correspondente
        if ("especialista".equalsIgnoreCase(titulacao)) {
            return 0.012; // 1.2% para especialista
        } else if ("doutor".equalsIgnoreCase(titulacao)) {
            return 0.016; // 1.6% para doutor
        } else if ("mestre".equalsIgnoreCase(titulacao)) {
            return 0.014; // 1.4% para mestre
        }
        return 0; // Caso a titulação não seja reconhecida, retorna 0% de contribuição
    }
    
    // Método público que calcula a contribuição do professor com base no salário e na taxa determinada pela titulação
    public double calcularContribuicao() {
        return salario * obterTaxaContribuicao(); // Calcula a contribuição multiplicando o salário pela taxa de contribuição
    }
    
    // Métodos getters e setters para acessar e modificar os atributos da classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler a entrada do usuário
        List<Professor> professores = new ArrayList<>(); // Lista para armazenar os objetos Professor
        double totalArrecadado = 0; // Variável para acumular o total arrecadado das contribuições
        int quantidadeMestres = 0; // Contador para a quantidade de professores com titulação "mestre"
        
        // Loop para coletar informações dos professores até que o usuário decida parar
        while (true){
            System.out.println("Digite o nome do professor:");
            String nome = scanner.nextLine(); // Lê o nome do professor
    
            System.out.println("Digite o CPF do professor:");
            String cpf = scanner.nextLine(); // Lê o CPF do professor
            
            System.out.println("Digite a titulação do professor (especialista, mestre, doutor):");
            String titulacao = scanner.nextLine(); // Lê a titulação do professor
            
            System.out.println("Digite o salário do professor:");
            double salario = scanner.nextDouble(); // Lê o salário do professor
            scanner.nextLine(); // Consome a nova linha deixada pelo nextDouble()
            
            // Cria um novo objeto Professor com as informações fornecidas
            Professor professor = new Professor(nome, cpf, titulacao, salario);
            professores.add(professor); // Adiciona o professor à lista de professores
            totalArrecadado += professor.calcularContribuicao(); // Acumula o total arrecadado com as contribuições dos professores
            
            // Verifica se o professor tem titulação "mestre" e incrementa o contador se verdadeiro
            if("mestre".equalsIgnoreCase(titulacao)){
                quantidadeMestres++;
            }
            
            // Pergunta ao usuário se deseja adicionar mais professores
            System.out.println("Deseja adicionar outro professor? (sim/não):");
            String resposta = scanner.nextLine(); // Lê a resposta do usuário
            if (!"sim".equalsIgnoreCase(resposta)) {
                break; // Sai do loop se a resposta não for "sim"
            }
        }

        // Exibe o total arrecadado e a quantidade de professores com titulação "mestre"
        System.out.println("Total arrecadado: " + totalArrecadado); 
        System.out.println("Quantidade de professores mestre: " + quantidadeMestres);
        
        scanner.close(); // Fecha o scanner para liberar recursos do sistema
    }
}

