package ito.dsc.poo.tda;

import java.util.ArrayList;
import java.util.List;

public class CatalogoEspecialistas {
    private List<Especialista> especialistas;

    public CatalogoEspecialistas() {
        this.especialistas = new ArrayList<>();
    }

    public void agregarEspecialista(Especialista especialista) {
        this.especialistas.add(especialista);
    }

    public void eliminarEspecialista(Especialista especialista) {
        this.especialistas.remove(especialista);
    }

    public List<Especialista> getEspecialistas() {
        return especialistas;
    }
}