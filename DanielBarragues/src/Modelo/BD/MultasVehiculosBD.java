/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import static Controlador.DanielBarragues.ArrayMatriculaYCodigo;
import Modelo.UML.MultasAPersonas;
import Modelo.UML.MultasEstablecidas;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 1gprogexa02
 */
public class MultasVehiculosBD {
    
    public static void InsertarVehiculoMultado(int Codigo, String Matricula, String Fecha) throws Exception{
        ConexionBD con = new ConexionBD();
        con.abrirConexion();
        PreparedStatement prep = con.getConexion().prepareStatement("INSERT INTO MULTASVEHICULOS VALUES(?,?,?)");
        prep.setInt(1, Codigo);
        prep.setString(2, Matricula);
        prep.setString(3, Fecha);
        prep.executeUpdate();
        prep.close();
        con.Desconectar();
    }
    
    public static void ConsultaVehiculosConMultas(String matricula) throws SQLException, Exception{
        ConexionBD con = new ConexionBD();
        con.abrirConexion();
        Statement stat = con.getConexion().createStatement();
        ResultSet res = stat.executeQuery("SELECT * FROM multasvehiculos WHERE matricula='" + matricula + "'");
        MultasAPersonas m = null;
        while (res.next()) {
            m = new MultasAPersonas();
            m.setCodigo(res.getString(1));
            m.setMatricula(res.getString(2));
            ArrayMatriculaYCodigo.add(m);
        }
        stat.close();
        res.close();
        con.Desconectar();
    }
}
