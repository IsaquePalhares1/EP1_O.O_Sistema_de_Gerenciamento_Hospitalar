package br.o_o.projeto1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        /* BOAS VINDAS */
        System.out.println("Bem-Vindo ao Menu de Gerenciamento Hospitalar\n");


        /* MENU INICIAL */
        int opcao;
        boolean isRunning = true;

        while (isRunning) {

            do {
                System.out.println("1 - Cadastrar Paciente\n" +
                        "2 - Cadastrar Paciente com Plano de Saúde\n" +
                        "3 - Cadastrar Médico\n" +
                        "4 - Agendar Consulta\n" +
                        "5 - Internar Paciente\n" +
                        "6 - Adicionar Plano de Saúde\n" +
                        "7 - Olhar Relatórios\n" +
                        "8 - Registrar Diagnóstico e Prescrição de Consulta\n" +
                        "9 - Cancelar Internação\n" +
                        "10 - Sair\n");
                System.out.print("Escolha uma das opções: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

            } while (opcao < 1 || opcao > 10);

            switch (opcao) {
                case 1:
                    System.out.println();
                    Paciente paciente = new Paciente();
                    paciente.cadastrarPaciente(scanner);
                    break;


                case 2:
                    System.out.println();
                    PacientePlano pacientePlano = new PacientePlano();
                    pacientePlano.cadastrarPacientePlano(scanner);
                    break;


                case 3:
                    System.out.println();
                    Medico medico = new Medico();
                    medico.cadastrarMedico(scanner);
                    break;


                case 4:
                    System.out.println();
                    Consulta consulta = new Consulta();
                    consulta.agendarConsulta(scanner);
                    break;


                case 5:
                    System.out.println();
                    Internacao internacao = new Internacao();
                    internacao.marcarInternacao(scanner);
                    break;


                case 6:
                    System.out.println();
                    PlanoSaude planoSaude = new PlanoSaude();
                    planoSaude.cadastrarPlano(scanner);
                    break;


                case 7:
                    System.out.println();
                    //...
                    break;


                case 8:
                    System.out.println();
                    Consulta consulta1 = new Consulta();
                    ArrayList<Consulta> consultas = consulta1.agendaDeConsultas();
                    consulta1.concluirConsulta(scanner, consultas);
                    break;


                case 9:
                    System.out.println();
                    Internacao internacao1 = new Internacao();
                    ArrayList<Internacao> internacoes = internacao1.historicoDeInternacoes();
                    internacao1.cancelarInternacao(scanner, internacoes);
                    break;

                case 10:
                    System.out.println();
                    //...
                    isRunning = false;
                    break;



            }

            opcao = 0;
        }

        scanner.close();
    }
}
