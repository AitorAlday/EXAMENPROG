/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Alumno;
import UML.Asignatura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 1gprogexa13
 */
public class BDAsignatura {

    public ArrayList<Asignatura> listarAsignaturas() throws Exception {
        BDConexion con= new BDConexion();
        PreparedStatement sentencia = con.getCon().prepareStatement("Select nombre from asignaturas");
        ResultSet rs= sentencia.executeQuery();
        ArrayList<Asignatura> asignaturas= new ArrayList();
        while(rs.next()){
            Asignatura a= new Asignatura();
            a.setNombre(rs.getString("nombre"));
            asignaturas.add(a);
        }
        sentencia.close();
        con.desconexion();
        return asignaturas;
    }

    public ArrayList<Asignatura> buscarPorAlumno(String nombre) throws Exception {
       BDConexion con= new BDConexion();
        PreparedStatement sentencia = con.getCon().prepareStatement("select nombreAsignatura from alumnosasignaturas where dniAlumno = (select dni from alumnos where nombre= ?)");
        sentencia.setString(1, nombre);
        ResultSet rs= sentencia.executeQuery();
        ArrayList<Asignatura> asignaturas= new ArrayList();
        while(rs.next()){
            Asignatura a = new Asignatura();
            a.setNombre(rs.getString("nombreAsignatura"));
            asignaturas.add(a);
        }
        sentencia.close();
        con.desconexion();
        return asignaturas;
    }
    
}
