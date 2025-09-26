package br.o_o.projeto1;

import java.time.LocalDate;

public class Internacao{

    /*    ATRIBUTOS    */
    private Paciente paciente;
    private Medico medico;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private int quarto;
    private double custo;


    /*  CONSTRUTOR */
    public Internacao(Paciente paciente, Medico medico, LocalDate dataEntrada, LocalDate dataSaida, int quarto, double custo){
        this.paciente= paciente;
        this.medico = medico;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.custo = custo;
    }


    /* MÉTODOS GET */
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public int getQuarto() {
        return quarto;
    }

    public double getCusto() {
        return custo;
    }


    /*  MÉTODOS SET  */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}