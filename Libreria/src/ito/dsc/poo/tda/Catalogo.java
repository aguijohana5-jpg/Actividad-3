package ito.dsc.poo.tda;


import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Libro> libros;

    public Catalogo() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        this.libros.remove(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}