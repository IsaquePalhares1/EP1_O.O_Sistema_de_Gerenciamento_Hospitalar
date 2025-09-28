package br.o_o.projeto1;

import java.util.ArrayList;

public class PacientePlano extends Paciente {


    /*    ATRIBUTOS    */
    private PlanoSaude planoSaude;


    /*  CONSTRUTOR */
    public PacientePlano(String nome, String cpf, int idade, ArrayList<String> histConsulta, ArrayList<String> histInternacao, PlanoSaude planoSaude) {
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



    /* MÉTODOS VALOR CONSULTA */
    public double valorConsulta(Medico medico, PlanoSaude planoSaude) {

        double custoBase = medico.getCustoConsulta();
        double valor = 0.0;

        switch (medico.getEspecialidade()) {


            case CARDIOLOGIA:
                valor = custoBase * (1 - planoSaude.getDescontoCardiologia());
                break;

            case DERMATOLOGIA:
                valor = custoBase * (1 - planoSaude.getDescontoDermatologia());
                break;

            case PEDIATRIA:
                valor = custoBase * (1 -planoSaude.getDescontoPediatria());
                break;

            case ORTOPEDIA:
                valor = custoBase * (1 - planoSaude.getDescontoOrtopedia());
                break;

            case NEUROLOGIA:
                valor = custoBase * (1 - planoSaude.getDescontoNeurologia());
                break;

            case GINECOLOGIA:
                valor = custoBase * (1 - planoSaude.getDescontoGinecologia());
                break;

            case PSIQUIATRIA:
                valor = custoBase * (1 - planoSaude.getDescontoPsiquiatria());
                break;

            case OFTALMOLOGIA:
                valor = custoBase * (1 - planoSaude.getDescontoOftalmologia());
                break;
        }

        if (getIdade() >= 60) {
            valor *= getPlanoSaude().getDescontoIdoso();
        }
        else {
            valor = valor;
        }


            return valor;
    }

}