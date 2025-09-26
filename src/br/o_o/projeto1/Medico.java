package br.o_o.projeto1;

public class Medico{

    /*    ATRIBUTOS    */
    private String nome;
    private String crm;
    private double custoConsulta;
    private String especialidade;
    private String[] agendaHorarios;


    /*  CONSTRUTOR */
    public Medico(String nome, String crm, double custoConsulta, String especialidade, String[] agendaHorarios){
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

    public String getEspecialidade() {
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

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}