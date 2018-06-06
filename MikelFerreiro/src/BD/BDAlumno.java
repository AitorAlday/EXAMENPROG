/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Alumno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 1gprogexa13
 */
public class BDAlumno {

    public boolean altaAlumno(Alumno a) throws Exception {
        BDConexion con= new BDConexion();
        Boolean correcto =false;
        PreparedStatement sentencia = con.getCon().prepareStatement("INSERT INTO `alumnos` VALUES(?,?)");
        sentencia.setString(1, a.getDni());
        sentencia.setString(2, a.getNombre());
        if(sentencia.executeUpdate()==1){
        for(int x=0;x<a.getAsignaturas().size();x++){
        sentencia = con.getCon().prepareStatement("INSERT INTO `alumnosasignaturas` VALUES(?,?)");
        sentencia.setString(1, a.getDni());
        sentencia.setString(2, a.getAsignaturas().get(x).getNombre());
        sentencia.executeUpdate();
        }
        correcto=true;
        }
        sentencia.close();
        con.desconexion();
        return correcto;
    }

    public ArrayList<Alumno> buscarPorAsignatura(String nombre) throws Exception {
        BDConexion con= new BDConexion();
        PreparedStatement sentencia = con.getCon().prepareStatement("Select dni,nombre from alumnos where dni in (select dniAlumno from alumnosasignaturas where nombreAsignatura = ?)");
        sentencia.setString(1, nombre);
        ResultSet rs= sentencia.executeQuery();
        ArrayList<Alumno> alumnos= new ArrayList();
        while(rs.next()){
            Alumno a = new Alumno();
            a.setDni(rs.getString("dni"));
            a.setNombre(rs.getString("nombre"));
            alumnos.add(a);
        }
        sentencia.close();
        con.desconexion();
        return alumnos;
    }
    
}
