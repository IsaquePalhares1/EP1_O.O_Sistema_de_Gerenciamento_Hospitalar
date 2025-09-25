package br.o_o.projeto1;

public class Medico{

    /*    ATRIBUTOS    */
    String nome;
    String crm;
    int custoConsulta;
    String especialidade;


    /*  CONSTRUTOR */
    public Medico(String nome, String crm, int custoConsulta, String especialidade){
        this.nome= nome;
        this.crm = crm;
        this.custoConsulta = custoConsulta;
        this.especialidade = especialidade;
    }


    /* MÉTODOS GET */
    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public int getCustoConsulta() {
        return custoConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }


    /*  MÉTODOS SET  */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setCustoConsulta(int custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}