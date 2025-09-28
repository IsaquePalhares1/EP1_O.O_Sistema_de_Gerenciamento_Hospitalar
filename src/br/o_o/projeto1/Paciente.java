package br.o_o.projeto1;

import java.util.ArrayList;

public class Paciente {

 /*    ATRIBUTOS    */
    private String nome;
    private String cpf;
    private int idade;
    private ArrayList<String> histConsulta; //Histórico de consultas
    private ArrayList<String> histInternacao; //Histórico de internações


    /*  CONSTRUTOR */
    public Paciente(String nome, String cpf, int idade, ArrayList<String> histConsulta, ArrayList<String> histInternacao){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.histConsulta = histConsulta;
        this.histInternacao = histInternacao;
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

    }
