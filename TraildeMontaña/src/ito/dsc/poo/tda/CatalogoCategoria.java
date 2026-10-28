package ito.dsc.poo.tda;


import java.util.ArrayList;
import java.util.List;

public class CatalogoCategoria {
    private List<Categoria> categorias;

    public CatalogoCategoria() {
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}