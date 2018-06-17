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
public class MultasAPersonas {
    private String matricula;
    private String codigo;
    private String Descripcion;
    private String Importe;
    private String Puntos;

    public MultasAPersonas() {
    }

    public MultasAPersonas(String matricula, String codigo, String Descripcion, String Importe, String Puntos) {
        this.matricula = matricula;
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.Importe = Importe;
        this.Puntos = Puntos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImporte() {
        return Importe;
    }

    public void setImporte(String Importe) {
        this.Importe = Importe;
    }

    public String getPuntos() {
        return Puntos;
    }

    public void setPuntos(String Puntos) {
        this.Puntos = Puntos;
    }

    

   
    
    
}
