package br.o_o.projeto1;

import java.util.HashMap;
import java.util.Map;

public class PlanoSaude {

    /*  ATRIBUTOS */
    private String nome;
    private Map<String, Double> descontoEspecialidade;
    private boolean internacaoGratuitaSemana;
    private double descontoIdoso;


    /*  CONSTRUTOR */
    public PlanoSaude(String nome){
        this.nome = nome;
        this.descontoEspecialidade = new HashMap<>();
        this.internacaoGratuitaSemana= false;
        this.descontoIdoso = 0.0;
    }


    /* MÉTODOS GET */
    public String getNome() {
        return nome;
    }

    public Map<String, Double> getDescontoEspecialidade() {
        return descontoEspecialidade;
    }

    public boolean isInternacaoGratuitaSemana(){
        return internacaoGratuitaSemana;
    }

    public double getDescontoIdoso() {
        return descontoIdoso;
    }


    /*  MÉTODOS SET  */
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setDescontoEspecialidade(Map<String, Double> descontoEspecialidade) {
        this.descontoEspecialidade = descontoEspecialidade;
    }


    public void setInternacaoGratuitaSemana(boolean internacaoGratuitaSemana) {
        this.internacaoGratuitaSemana = internacaoGratuitaSemana;
    }

    public void setDescontoIdoso(double descontoIdoso) {
        this.descontoIdoso = descontoIdoso;
    }


}



