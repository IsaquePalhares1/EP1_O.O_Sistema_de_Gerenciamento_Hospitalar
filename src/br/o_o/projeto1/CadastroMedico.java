package br.o_o.projeto1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class CadastroMedico{

    /* ATRIBUTOS */
    private ArrayList<Medico> medicos;

    /* CONSTRUTOR */
    public CadastroMedico() throws IOException {

        this.medicos =  new ArrayList<>();

    }


    /* GET */
    public ArrayList<Medico> getMedicos(){
        return medicos;
    }


    /* METODO ADICIONAR MEDICO*/
    public void addMedico (Medico medico) throws IOException{
        PrintWriter escrever = new PrintWriter(new FileWriter("cadastro_medico.txt", true));
        medicos.add(medico);
        escrever.println(medico.getNome() + ";" +
                medico.getCrm() + ";" +
                medico.getCustoConsulta() + ";" +
                medico.getEspecialidade() + ";" +
                String.join("|", medico.getAgendaHorarios()) );

        escrever.close();
    }

    /* METODO CARREGAR ARQUIVO */
    public void carregarDoArquivo() throws IOException {
        File arquivo = new File("cadastro_medico.txt");
        if (!arquivo.exists()) return;

        Scanner ler = new Scanner(arquivo);

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] partes = linha.split(";");
            String nome = partes[0];
            String crm = partes[1];
            double custoConsulta = Double.parseDouble(partes[2]);
            Especialidade especialidade = Especialidade.parseEspecialidade(partes[3]);
            ArrayList<String> agendaHorarios = new ArrayList<>(Arrays.asList(partes[4].split("\\|")));

            Medico m = new Medico(nome, crm, custoConsulta, especialidade, agendaHorarios);
            medicos.add(m);


        }

        ler.close();
    }




}

