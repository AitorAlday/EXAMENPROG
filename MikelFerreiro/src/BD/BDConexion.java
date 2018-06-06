/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Excepciones.Excepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1gprogexa13
 */
public class BDConexion {
    Connection con;

    public BDConexion() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/examentercera","root","usbw");
        if (con ==null){
            throw new Excepcion(1);
        }
    }

    public Connection getCon() {
        return con;
    }
    
    public void desconexion () throws SQLException{
        con.close();
    }
    
}
