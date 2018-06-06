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
public class Alumno {
    private String dni,nombre;
    private ArrayList<Asignatura> asignaturas;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, ArrayList<Asignatura> asignaturas) {
        this.dni = dni;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
}
