/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import Modelo.UML.MultasAPersonas;
import Modelo.UML.MultasEstablecidas;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 1gprogexa02
 */
public class ConsultaPropietarioBD {
    public static ArrayList ConsultaVehiculosConMultas(String dni) throws SQLException, Exception{
        ConexionBD con = new ConexionBD();
        con.abrirConexion();
        Statement stat = con.getConexion().createStatement();
        ResultSet res = stat.executeQuery("SELECT matricula FROM vehiculos WHERE dni='" + dni + "'");
        MultasAPersonas m = null;
        ArrayList array = new ArrayList();
        while (res.next()) {
            m = new MultasAPersonas();
            m.setMatricula(res.getString(1));
            array.add(m);
        }
        stat.close();
        res.close();
        con.Desconectar();
        return array;
    }
}
