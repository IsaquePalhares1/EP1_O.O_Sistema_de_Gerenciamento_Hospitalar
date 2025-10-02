package br.o_o.projeto1;


public class PlanoSaude {

    /*  ATRIBUTOS */
    private String nome;
    private double descontoCardiologia;
    private double descontoDermatologia;
    private double descontoPediatria;
    private double descontoOrtopedia;
    private double descontoNeurologia;
    private double descontoGinecologia;
    private double descontoPsiquiatria;
    private double descontoOftalmologia;
    private boolean internacaoGratuitaSemana;
    private double descontoIdoso;


    /*  CONSTRUTORES */
    public PlanoSaude(String nome){
        this.nome = nome;
        this.descontoCardiologia = 0.0;
        this.descontoDermatologia = 0.0;
        this.descontoPediatria = 0.0;
        this.descontoOrtopedia = 0.0;
        this.descontoNeurologia = 0.0;
        this.descontoGinecologia = 0.0;
        this.descontoPsiquiatria = 0.0;
        this.descontoOftalmologia = 0.0;
        this.internacaoGratuitaSemana= false;
        this.descontoIdoso = 0.0;
    }

    public PlanoSaude(){
        this.nome = " ";
        this.descontoCardiologia = 0.0;
        this.descontoDermatologia = 0.0;
        this.descontoPediatria = 0.0;
        this.descontoOrtopedia = 0.0;
        this.descontoNeurologia = 0.0;
        this.descontoGinecologia = 0.0;
        this.descontoPsiquiatria = 0.0;
        this.descontoOftalmologia = 0.0;
        this.internacaoGratuitaSemana= false;
        this.descontoIdoso = 0.0;
    }


    /* MÉTODOS GET */
    public String getNome() {
        return nome;
    }

    public String isInternacaoGratuitaSemana(){

        if (internacaoGratuitaSemana == true){
            return "Sim";
        }
        else {
            return "Não";
        }

    }

    public double getDescontoIdoso() {
        return descontoIdoso;
    }

    public double getDescontoCardiologia() {
        return descontoCardiologia;
    }

    public double getDescontoDermatologia() {
        return descontoDermatologia;
    }

    public double getDescontoPediatria() {
        return descontoPediatria;
    }

    public double getDescontoOrtopedia() {
        return descontoOrtopedia;
    }

    public double getDescontoNeurologia() {
        return descontoNeurologia;
    }

    public double getDescontoGinecologia() {
        return descontoGinecologia;
    }

    public double getDescontoPsiquiatria() {
        return descontoPsiquiatria;
    }

    public double getDescontoOftalmologia() {
        return descontoOftalmologia;
    }


    /*  MÉTODOS SET  */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInternacaoGratuitaSemana(boolean internacaoGratuitaSemana) {
        this.internacaoGratuitaSemana = internacaoGratuitaSemana;
    }

    public void setDescontoIdoso(double descontoIdoso) {
        this.descontoIdoso = descontoIdoso;
    }

    public void setDescontoCardiologia(double descontoCardiologia) {
        this.descontoCardiologia = descontoCardiologia;
    }

    public void setDescontoDermatologia(double descontoDermatologia) {
        this.descontoDermatologia = descontoDermatologia;
    }

    public void setDescontoPediatria(double descontoPediatria) {
        this.descontoPediatria = descontoPediatria;
    }

    public void setDescontoOrtopedia(double descontoOrtopedia) {
        this.descontoOrtopedia = descontoOrtopedia;
    }

    public void setDescontoNeurologia(double descontoNeurologia) {
        this.descontoNeurologia = descontoNeurologia;
    }

    public void setDescontoGinecologia(double descontoGinecologia) {
        this.descontoGinecologia = descontoGinecologia;
    }

    public void setDescontoPsiquiatria(double descontoPsiquiatria) {
        this.descontoPsiquiatria = descontoPsiquiatria;
    }

    public void setDescontoOftalmologia(double descontoOftalmologia) {
        this.descontoOftalmologia = descontoOftalmologia;
    }


    /*  TO STRING */
    @Override
    public String toString(){
        return    "Nome do Plano: " + nome + "\n"
                + "Desconto Cardiologia: " + descontoCardiologia + "\n"
                + "Desconto Dematologia: " + descontoDermatologia + "\n"
                + "Desconto Pediatria: " + descontoPediatria + "\n"
                + "Desconto Ortopedia: " + descontoOrtopedia + "\n"
                + "Desconto Neurologia: " + descontoNeurologia + "\n"
                + "Desconto Ginecologia: " + descontoGinecologia + "\n"
                + "Desconto Psiquiatria: " + descontoPsiquiatria + "\n"
                + "Desconto Oftalmologia: " + descontoOftalmologia + "\n"
                + "Tem internação gratuita: " + isInternacaoGratuitaSemana() + "\n"
                + "Desconto para idoso: " + descontoIdoso;
    }


}



