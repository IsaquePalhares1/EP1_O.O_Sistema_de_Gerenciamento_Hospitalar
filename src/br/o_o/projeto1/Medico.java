package br.o_o.projeto1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Medico{

    /*    ATRIBUTOS    */
    private String nome;
    private String crm;
    private double custoConsulta;
    private Especialidade especialidade;
    private ArrayList<String> agendaHorarios;


    /*  CONSTRUTORES */
    public Medico(String nome, String crm, double custoConsulta, Especialidade especialidade, ArrayList<String> agendaHorarios){
        this.nome= nome;
        this.crm = crm;
        this.custoConsulta = custoConsulta;
        this.especialidade = especialidade;
        this.agendaHorarios = agendaHorarios;
    }

    public Medico(){
        this.nome= " ";
        this.crm = " ";
        this.custoConsulta = 0.0;
        this.especialidade = Especialidade.PADRAO;
        this.agendaHorarios = new ArrayList<>();
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

    public ArrayList<String> getAgendaHorarios() {
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
                + "Agenda de horários: " + String.join("|", agendaHorarios);

    }

    /* METODO CADASTRAR MEDICO */
    public void cadastrarMedico(Scanner scanner) throws IOException {
        Medico medico = new Medico();

        System.out.print("Nome do médico: ");
        String nome = scanner.nextLine();
        medico.setNome(nome);

        System.out.print("Crm do médico: ");
        String crm = scanner.nextLine();
        medico.setCrm(crm);

        System.out.print("Custo das consultas do médico: ");
        double custoConsulta = scanner.nextDouble();
        medico.setCustoConsulta(custoConsulta);
        scanner.nextLine();

        System.out.print("Especialidade do médico: ");
        Especialidade especialidade = Especialidade.parseEspecialidade(scanner.nextLine());
        medico.setEspecialidade(especialidade);


        /*ADIÇAO NO ARQUIVO*/
        try(PrintWriter escrever = new PrintWriter(new FileWriter("cadastro_medicos.txt", true))) {
            escrever.println(medico.getNome() + ";" +
                    medico.getCrm() + ";" +
                    medico.getCustoConsulta() + ";" +
                    medico.getEspecialidade() + ";" +
                    String.join("|", medico.getAgendaHorarios()));


        }

    }
}