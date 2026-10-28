package ito.dsc.poo.tda;

import java.util.ArrayList;
import java.util.List;

public class CatalogoPaciene {
    private List<Paciente> pacientes;

    public CatalogoPaciene() {
        this.pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        this.pacientes.remove(paciente);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}