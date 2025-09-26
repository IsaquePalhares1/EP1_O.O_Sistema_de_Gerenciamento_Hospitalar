package br.o_o.projeto1;

public class PacientePlano extends Paciente {


    /*    ATRIBUTOS    */
    private PlanoSaude planoSaude;


    /*  CONSTRUTOR */
    public PacientePlano(String nome, String cpf, int idade, String[] histConsulta, String[] histInternacao, PlanoSaude planoSaude) {
        super(nome, cpf, idade, histConsulta, histInternacao);
        this.planoSaude = planoSaude;
    }


    /* MÉTODOS GET */
    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }


    /*  MÉTODOS SET  */
    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }


    /*  TO STRING */
    @Override
    public String toString(){
        return    super.toString() + "\n"
                + "Plano de Saúde: " + planoSaude;
    }

}