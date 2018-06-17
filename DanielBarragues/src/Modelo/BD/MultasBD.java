/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;
import Modelo.UML.MultasEstablecidas;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 1gprogexa02
 */
public class MultasBD {
    
    public static ArrayList ConsultaMultas() throws SQLException, Exception{
        ConexionBD con = new ConexionBD();
        con.abrirConexion();
        Statement stat = con.getConexion().createStatement();
        ResultSet res = stat.executeQuery("SELECT * FROM MULTAS");
        MultasEstablecidas m = null;
        ArrayList array = new ArrayList();
        while (res.next()) {
            m = new MultasEstablecidas();
            m.setCodigo(res.getString(1));
            m.setDescripcion(res.getString(2));
            m.setImporte(res.getString(3));
            m.setPuntos(res.getString(4));
            array.add(m);
        }
        stat.close();
        res.close();
        con.Desconectar();
        return array;
    }
    
}
