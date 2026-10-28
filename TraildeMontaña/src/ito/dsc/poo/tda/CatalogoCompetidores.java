package ito.dsc.poo.tda;


import java.util.ArrayList;
import java.util.List;

public class CatalogoCompetidores {
    private List<Competidor> competidores;

    public CatalogoCompetidores() {
        this.competidores = new ArrayList<>();
    }

    public void agregarCompetidor(Competidor competidor) {
        this.competidores.add(competidor);
    }

    public void eliminarCompetidor(Competidor competidor) {
        this.competidores.remove(competidor);
    }

    public List<Competidor> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(List<Competidor> competidores) {
        this.competidores = competidores;
    }
}