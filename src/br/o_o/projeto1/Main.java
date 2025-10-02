package br.o_o.projeto1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem-Vindo ao Sistema de Gerenciamento Hospitalar");

        try {
            // Cria o cadastro e já carrega pacientes do arquivo
            CadastroPaciente cadastro = new CadastroPaciente();

            // Mostra pacientes já cadastrados
            System.out.println("Pacientes já cadastrados:");
            for (Paciente p : cadastro.getPacientes()) {
                System.out.println(p.getNome() + " - " + p.getCpf());
            }

            // Cria novos pacientes
            ArrayList<String> consultas1 = new ArrayList<>(Arrays.asList("Consulta1", "Consulta2"));
            ArrayList<String> internacoes1 = new ArrayList<>(Arrays.asList("Internacao1"));
            Paciente paciente1 = new Paciente("João", "123456789", 30, consultas1, internacoes1);

            ArrayList<String> consultas2 = new ArrayList<>(Arrays.asList("ConsultaA"));
            ArrayList<String> internacoes2 = new ArrayList<>();
            Paciente paciente2 = new Paciente("Maria", "987654321", 25, consultas2, internacoes2);

            // Adiciona novos pacientes no cadastro e salva no arquivo
            cadastro.addPaciente(paciente1);
            cadastro.addPaciente(paciente2);

            // Mostra todos os pacientes após adicionar
            System.out.println("\nTodos os pacientes após adicionar novos:");
            for (Paciente p : cadastro.getPacientes()) {
                System.out.println(p.getNome() + " - " + p.getCpf());
            }

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }


        try {
            // Cria o cadastro e carrega médicos do arquivo
            CadastroMedico cadastro = new CadastroMedico();

            // Mostra médicos já cadastrados
            System.out.println("Médicos já cadastrados:");
            for (Medico m : cadastro.getMedicos()) {
                System.out.println(m.getNome() + " - " + m.getCrm() + " - " + m.getEspecialidade());
            }

            // Cria novos médicos
            ArrayList<String> agenda1 = new ArrayList<>(Arrays.asList("09:00", "10:00", "11:00"));
            Medico medico1 = new Medico("Dr. João", "12345", 200.0, Especialidade.CARDIOLOGIA, agenda1);

            ArrayList<String> agenda2 = new ArrayList<>(Arrays.asList("14:00", "15:00"));
            Medico medico2 = new Medico("Dra. Maria", "67890", 250.0, Especialidade.DERMATOLOGIA, agenda2);

            // Adiciona novos médicos no cadastro e salva no arquivo
            cadastro.addMedico(medico1);
            cadastro.addMedico(medico2);

            // Mostra todos os médicos após adicionar novos
            System.out.println("\nTodos os médicos após adicionar novos:");
            for (Medico m : cadastro.getMedicos()) {
                System.out.println(m.getNome() + " - " + m.getCrm() + " - " + m.getEspecialidade());
            }

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }

    }
}
