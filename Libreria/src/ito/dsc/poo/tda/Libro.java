package ito.dsc.poo.tda;


public class Libro {
	
    private String titulo;
    private String autores;
    private int anioPublicacion;
    private String editorial;
    private int cantidadEjemplares;

    public Libro(String titulo, String autores, int anioPublicacion, String editorial, int cantidadEjemplares) {
        this.titulo = titulo;
        this.autores = autores;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public void agregarEjemplar() {
        this.cantidadEjemplares++;
    }

    public void retirarEjemplar() {
        if (this.cantidadEjemplares > 0) {
            this.cantidadEjemplares--;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
}