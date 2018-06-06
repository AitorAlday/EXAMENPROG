/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gprogexa13
 */
public class Profesor {
    private String Nombre;
    private ArrayList <Asignatura> asignaturas;

    public Profesor() {
    }

    public Profesor(String Nombre) {
        this.Nombre = Nombre;
    }

    public Profesor(String Nombre, ArrayList<Asignatura> asignaturas) {
        this.Nombre = Nombre;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}
