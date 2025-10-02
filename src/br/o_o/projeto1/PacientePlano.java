package br.o_o.projeto1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PacientePlano extends Paciente {


    /*    ATRIBUTOS    */
    private PlanoSaude planoSaude;


    /*  CONSTRUTORES */
    public PacientePlano(String nome, String cpf, int idade, ArrayList<String> histConsulta, ArrayList<String> histInternacao, PlanoSaude planoSaude) {
        super(nome, cpf, idade, histConsulta, histInternacao);
        this.planoSaude = planoSaude;
    }

    public PacientePlano() {
        super();
        this.planoSaude = new PlanoSaude();
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
            valor *= (1- getPlanoSaude().getDescontoIdoso());
        }
        else {
            valor = valor;
        }


            return valor;
    }

    /* METODO CADASTRAR PACIENTE PLANO */
    public void cadastrarPacientePlano(Scanner scanner) throws IOException {
        PacientePlano pacientePlano = new PacientePlano();

        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        pacientePlano.setNome(nome);

        System.out.print("Cpf do paciente: ");
        String cpf = scanner.nextLine();
        pacientePlano.setCpf(cpf);

        System.out.print("Idade do paciente: ");
        int idade = scanner.nextInt();
        pacientePlano.setIdade(idade);
        scanner.nextLine();

        System.out.print("Plano de Saúde do paciente: ");
        String plano = scanner.nextLine();
        PlanoSaude planoSaude = new PlanoSaude(plano);
        pacientePlano.setPlanoSaude(planoSaude);;


        /*ADIÇAO NO ARQUIVO*/
        try(PrintWriter escrever = new PrintWriter(new FileWriter("cadastro_pacientes.txt", true))) {
            escrever.println(pacientePlano.getNome() + ";" +
                    pacientePlano.getCpf() + ";" +
                    pacientePlano.getIdade() + ";" +
                    pacientePlano.getPlanoSaude().getNome() + ";" +
                    String.join("|", pacientePlano.getHistConsultas()) + ";" +
                    String.join("|", pacientePlano.getHistInternacoes()));

        }

    }

}