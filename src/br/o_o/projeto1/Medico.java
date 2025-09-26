package br.o_o.projeto1;

import java.util.Arrays;

public class Medico{

    /*    ATRIBUTOS    */
    private String nome;
    private String crm;
    private double custoConsulta;
    private Especialidade especialidade;
    private String[] agendaHorarios;


    /*  CONSTRUTOR */
    public Medico(String nome, String crm, double custoConsulta, Especialidade especialidade, String[] agendaHorarios){
        this.nome= nome;
        this.crm = crm;
        this.custoConsulta = custoConsulta;
        this.especialidade = especialidade;
        this.agendaHorarios = agendaHorarios;
    }


    /* MÉTODOS GET */
    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String[] getAgendaHorarios() {
        return agendaHorarios;
    }

    /*  MÉTODOS SET  */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    /* TO STRING */
    @Override
    public String toString(){
        return    "Nome: " + nome + "\n"
                + "Crm: " + crm + "\n"
                + "Custo da Consulta: " + custoConsulta + "\n"
                + "Especialidade: " + especialidade + "\n"
                + "Agenda de horários: " + Arrays.toString(agendaHorarios);

    }
}