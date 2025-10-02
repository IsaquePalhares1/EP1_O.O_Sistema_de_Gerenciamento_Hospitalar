package br.o_o.projeto1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class CadastroPaciente{

    /* ATRIBUTOS */
    private ArrayList<Paciente> pacientes;

    /* CONSTRUTOR */
    public CadastroPaciente () throws IOException {

        this.pacientes =  new ArrayList<>();

    }


    /* GET */
    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }


    /* METODO ADICIONAR PACIENTE*/
    public void addPaciente (Paciente paciente) throws IOException{
        PrintWriter escrever = new PrintWriter(new FileWriter("cadastro_paciente.txt", true));
        pacientes.add(paciente);
        escrever.println(paciente.getNome() + ";" +
                paciente.getCpf() + ";" +
                paciente.getIdade() + ";" +
                String.join("|", paciente.getHistConsultas()) + ";" +
                String.join("|", paciente.getHistInternacoes()));
        escrever.close();
    }

    /* METODO CARREGAR ARQUIVO */
    public void carregarDoArquivo() throws IOException {
        File arquivo = new File("cadastro_paciente.txt");
        if (!arquivo.exists()) return;

        Scanner ler = new Scanner(arquivo);

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] partes = linha.split(";");
            String nome = partes[0];
            String cpf = partes[1];
            int idade = Integer.parseInt(partes[2]);
            ArrayList<String> consultas = new ArrayList<>(Arrays.asList(partes[3].split("\\|")));
            ArrayList<String> internacoes = new ArrayList<>(Arrays.asList(partes[4].split("\\|")));

            Paciente p = new Paciente(nome, cpf, idade, consultas, internacoes);
            pacientes.add(p);


        }

        ler.close();
    }




}

