package ito.dsc.poo.tda;

public class Categoria {
    private String nombreCategoria;
    private double distancia;
    private String genero;

    public Categoria(String nombreCategoria, double distancia, String genero) {
        this.nombreCategoria = nombreCategoria;
        this.distancia = distancia;
        this.genero = genero;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}