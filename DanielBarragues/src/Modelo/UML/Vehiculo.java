/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.UML;

/**
 *
 * @author 1gprogexa02
 */
public class Vehiculo {
    
    private String matricula;
    private String modelo;
    private String marca;
    private String dni;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, String marca, String dni) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.dni = dni;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
