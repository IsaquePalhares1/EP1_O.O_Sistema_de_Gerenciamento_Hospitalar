package br.o_o.projeto1;

//import java.security.SecureRandom;
import java.time.LocalDateTime;
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
}