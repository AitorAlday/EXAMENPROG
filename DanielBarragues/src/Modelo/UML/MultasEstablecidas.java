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
public class MultasEstablecidas {
    private String Codigo;
    private String Descripcion;
    private String Importe;
    private String Puntos;

    public MultasEstablecidas() {
    }

    public MultasEstablecidas(String Codigo, String Descripcion, String Importe, String Puntos) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Importe = Importe;
        this.Puntos = Puntos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
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
