package br.o_o.projeto1;

public class Paciente {

 /*    ATRIBUTOS    */
    String nome;
    String cpf;
    int idade;
    String[] histConsulta; //Histórico de consultas
    String[] histInternacao; //Histórico de internações


    /*  CONSTRUTOR */
    public Paciente(String nome, String cpf, int idade, String[] histConsulta, String[] histInternacao){
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

    public String[] getHistConsultas(){
        return histConsulta;
    }

    public String[] getHistInternacoes(){
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
}