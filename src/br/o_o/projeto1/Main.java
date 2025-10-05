package br.o_o.projeto1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        /* BOAS VINDAS */
        System.out.println("Bem-Vindo ao Menu de Gerenciamento Hospitalar\n");


        /* MENU INICIAL */
        int opcao;

        do {
            System.out.println("1 - Cadastrar Paciente\n" +
                               "2 - Cadastrar Paciente com Plano de Saúde\n" +
                               "3 - Cadastrar Médico\n" +
                               "4 - Agendar Consulta\n" +
                               "5 - Internar Paciente\n" +
                               "6 - Adicionar Plano de Saúde\n" +
                               "7 - Olhar Relatórios\n" +
                               "8 - Outros\n" +
                               "9 - Sair\n");
            System.out.print("Escolha uma das opções: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

        } while (opcao < 1 || opcao > 9);

        switch (opcao){
            case 1:
                System.out.println();
                Paciente paciente = new Paciente();
                paciente.cadastrarPaciente(scanner);
                return;

            case 2:
                System.out.println();
                PacientePlano pacientePlano = new PacientePlano();
                pacientePlano.cadastrarPacientePlano(scanner);
                return;

            case 3:
                System.out.println();
                Medico medico = new Medico();
                medico.cadastrarMedico(scanner);
                return;

            case 4:
                System.out.println();
                Consulta consulta = new Consulta();
                consulta.agendarConsulta(scanner);
                return;

            case 5:
                System.out.println();
                Internacao internacao = new Internacao();
                internacao.marcarInternacao(scanner);
                return;

            case 6:
                System.out.println();
                PlanoSaude planoSaude = new PlanoSaude();
                planoSaude.cadastrarPlano(scanner);
                return;

            case 7:
                System.out.println();
                //...
                return;

            case 8:
                System.out.println();
                //...
                return;

            case 9:
                System.out.println();
                //...
                return;



        }







        scanner.close();
    }

}
