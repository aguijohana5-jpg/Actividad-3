package ito.dsc.poo.tda;


public class Competidor {
    private String nombreCompleto;
    private int numeroCorredor;
    private String genero;
    private Categoria categoria;
    private boolean culminio;
    private double tiempo;
    private boolean primerosDiez;

    public Competidor(String nombreCompleto, int numeroCorredor, String genero, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCorredor = numeroCorredor;
        this.genero = genero;
        this.categoria = categoria;
        this.culminio = false;
        this.tiempo = 0.0;
        this.primerosDiez = false;
    }

    public void asignarNumero() {
    }

    public void registrarResultado(boolean culminio, double tiempo, boolean primerosDiez) {
        this.culminio = culminio;
        this.tiempo = tiempo;
        this.primerosDiez = primerosDiez;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumeroCorredor() {
        return numeroCorredor;
    }

    public void setNumeroCorredor(int numeroCorredor) {
        this.numeroCorredor = numeroCorredor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isCulminio() {
        return culminio;
    }

    public void setCulminio(boolean culminio) {
        this.culminio = culminio;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isPrimerosDiez() {
        return primerosDiez;
    }

    public void setPrimerosDiez(boolean primerosDiez) {
        this.primerosDiez = primerosDiez;
    }
}