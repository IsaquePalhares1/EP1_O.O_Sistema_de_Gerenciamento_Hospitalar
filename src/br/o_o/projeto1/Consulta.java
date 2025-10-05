package br.o_o.projeto1;

//import java.security.SecureRandom;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Arrays;

public class Consulta {

    /*    ATRIBUTOS    */
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private String local;
    private String status;


    /*  CONSTRUTOR */
    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String local, String status){
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.local = local;
        this.status = status;
    }

    public Consulta(){
        this.paciente = new Paciente();
        this.medico = new Medico();
        this.dataHora = null;
        this.local = " ";
        this.status = " ";
    }


    /* MÉTODOS GET */
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getLocal() {
        return local;
    }

    public String getStatus() {
        return status;
    }


    /*  MÉTODOS SET  */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /* TO STRING */
    @Override
    public String toString(){
        return    "Paciente: " + paciente + "\n"
                + "Médico: " + medico + "\n"
                + "Data e Hora: " + dataHora + "\n"
                + "Local: " + local + "\n"
                + "Status: " + status;

    }


        /* METODO AGENDAR CONSULTA */
        public void agendarConsulta(Scanner scanner) throws IOException {

            System.out.print("Nome do Paciente: ");
            String nomeP = scanner.nextLine();

            System.out.print("Cpf do Paciente: ");
            String cpf = scanner.nextLine();

            System.out.print("Nome do Médico: ");
            String nomeM = scanner.nextLine();

            System.out.print("Crm do Médico: ");
            String crm = scanner.nextLine();

            System.out.print("Local da consulta: ");
            String local = scanner.nextLine();

            System.out.print("Data e hora (formato: AAAA-MM-DDTHH:MM): ");
            String dataHoraStr = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            LocalDateTime dataHora = LocalDateTime.parse(dataHoraStr, formatter);

            Paciente cadastroP = new Paciente();
            cadastroP.setNome(nomeP);
            cadastroP.setCpf(cpf);
            ArrayList<Paciente> listaPaciente = cadastroP.listaPacientes();
            for (Paciente p : listaPaciente) {
                if (p.getNome().equals(cadastroP.getNome()) && p.getCpf().equals(cadastroP.getCpf())) {
                    cadastroP = p;
                    break;
                }
            }

            Medico cadastroM = new Medico();
            cadastroM.setNome(nomeM);
            cadastroM.setCrm(crm);
            ArrayList<Medico> listaMedico = cadastroM.listaMedicos();
            for (Medico m : listaMedico) {
                if (m.getNome().equals(cadastroM.getNome()) && m.getCrm().equals(cadastroM.getCrm())) {
                    cadastroM = m;
                    break;
                }
            }

            Consulta consulta = new Consulta(cadastroP, cadastroM, dataHora, local, "AGENDADA");

            /* ADIÇÃO NO ARQUIVO */
            try (PrintWriter escrever = new PrintWriter(new FileWriter("agenda_consultas.txt", true))) {
                escrever.println(cadastroP.getNome() + ";" +
                        cadastroM.getNome() + ";" +
                        consulta.getDataHora().format(formatter) + ";" +
                        consulta.getLocal() + ";" +
                        consulta.getStatus());
            }
        }




        /* METODO AGENDA DE CONSULTAS */
        public ArrayList<Consulta> agendaDeConsultas() throws IOException {
            ArrayList<Consulta> consultas = new ArrayList<>();

            File arquivo = new File("agenda_consultas.txt");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

            try (Scanner leitor = new Scanner(arquivo)) {
                while (leitor.hasNextLine()) {
                    String c = leitor.nextLine();
                    String[] partes = c.split(";");
                    String nomeP = partes[0];
                    String nomeM = partes[1];
                    LocalDateTime dataHora = LocalDateTime.parse(partes[2], formatter);
                    String local = partes[3];
                    String status = partes[4];

                    Paciente paciente = new Paciente();
                    for (Paciente p : paciente.listaPacientes()) {
                        if (p.getNome().equals(nomeP)) {
                            paciente = p;
                            break;
                        }
                    }

                    Medico medico = new Medico();
                    for (Medico m : medico.listaMedicos()) {
                        if (m.getNome().equals(nomeM)) {
                            medico = m;
                            break;
                        }
                    }

                    Consulta consulta = new Consulta(paciente, medico, dataHora, local, status);
                    consultas.add(consulta);
                }
            }

            return consultas;
        }
}