/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;
import java.sql.*;

/**
 *
 * @author 1gprogexa02
 */
public class ConexionBD {
    private Connection conexion;
    
    public void abrirConexion() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/examen10f";
        conexion = DriverManager.getConnection(url,"root","usbw");
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void Desconectar(){
        conexion = null;
    }
}
