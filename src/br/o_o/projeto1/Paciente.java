package br.o_o.projeto1;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Paciente {

 /*    ATRIBUTOS    */
    private String nome;
    private String cpf;
    private int idade;
    private ArrayList<String> histConsulta; //Histórico de consultas
    private ArrayList<String> histInternacao; //Histórico de internações


    /*  CONSTRUTORES */
    public Paciente(String nome, String cpf, int idade, ArrayList<String> histConsulta, ArrayList<String> histInternacao){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.histConsulta = histConsulta;
        this.histInternacao = histInternacao;
    }

    public Paciente(){
        this.nome = " ";
        this.cpf = " ";
        this.idade = 0;
        this.histConsulta = new ArrayList<>();
        this.histInternacao = new ArrayList<>();
    }


    /* MÉTODOS GET */
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public int getIdade(){
        return idade;
    }

    public ArrayList<String> getHistConsultas(){
        return histConsulta;
    }

    public ArrayList<String> getHistInternacoes(){
        return histInternacao;
    }



    /*  MÉTODOS SET  */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /* TO STRING */
    @Override
    public String toString(){
        return    "Nome: " + nome + "\n"
                + "Cpf: " + cpf + "\n"
                + "Idade: " + idade + "\n"
                + "Histórico de Consultas: " + String.join(" | ", histConsulta) + "\n"
                + "Histórico de Internações: " + String.join(" | ", histInternacao);
    }


    /* MÉTODOS VALOR CONSULTA */
    public double valorConsulta(Medico medico){
        return medico.getCustoConsulta();

    }

    /* METODO CADASTRAR PACIENTE */
    public void cadastrarPaciente(Scanner scanner) throws IOException{
        Paciente paciente = new Paciente();

        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        paciente.setNome(nome);

        System.out.print("Cpf do paciente: ");
        String cpf = scanner.nextLine();
        paciente.setCpf(cpf);

        System.out.print("Idade do paciente: ");
        int idade = scanner.nextInt();
        paciente.setIdade(idade);
        scanner.nextLine();


        /*ADIÇAO NO ARQUIVO*/
        try(PrintWriter escrever = new PrintWriter(new FileWriter("cadastro_pacientes.txt", true))) {
            escrever.println(paciente.getNome() + ";" +
                    paciente.getCpf() + ";" +
                    paciente.getIdade() + ";" +
                    String.join("|", paciente.getHistConsultas()) + ";" +
                    String.join("|", paciente.getHistInternacoes()));

        }


    }

}
