/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mikelferreiro;

import BD.*;
import UML.Alumno;
import UML.Asignatura;
import Vistas.*;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gprogexa13
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static BDAlumno bdAlumno;
    private static BDAsignatura bdAsignatura;
    private static BDProfesor bdProfesor;
    
    public static void main(String[] args) throws Exception {
        iniciarValores();
        abrirVentana(1);
        
    }

    private static void iniciarValores() {
        bdAlumno = new BDAlumno();
        bdAsignatura = new BDAsignatura();
        bdProfesor = new BDProfesor();
    }
    
    public static void abrirVentana(int x) throws Exception{
        switch(x){
            case 1:
                VPrincipal vprincipal=new VPrincipal();
                vprincipal.setVisible(true);
                break;
            case 2:
                VAlta valta=new VAlta();
                valta.setVisible(true);
                break;
            case 3:
                VConsulta vconsulta=new VConsulta();
                vconsulta.setVisible(true);
                break;
        }
    }
    public static void reabrirVentana(JFrame v) throws Exception {
                cerrarJframe(v);
                VAlta valta=new VAlta();
                valta.setVisible(true);
   
    }
    public static void cerrarVentana(JDialog v) {
        JOptionPane.showMessageDialog(null, "Hasta la vista.");
        v.dispose();
    }
    public static void cerrarJframe(JFrame v) {
       v.dispose();
    }
    public static ArrayList<Asignatura> listarAsignaturas() throws Exception {
        return bdAsignatura.listarAsignaturas();
    }

    public static boolean altaAlumno(String dni, String nombre, ArrayList<Asignatura> asignaturasAlumno) throws Exception {
        Alumno a= new Alumno();
        a.setDni(dni);
        a.setNombre(nombre);
        a.setAsignaturas(asignaturasAlumno);
        return bdAlumno.altaAlumno(a);
    }

    public static ArrayList<Alumno> buscarPorAsignatura(String nombre) throws Exception {
        return bdAlumno.buscarPorAsignatura(nombre);
    }

    public static ArrayList<Asignatura> buscarPorAlumno(String nombre) throws Exception {
        return bdAsignatura.buscarPorAlumno(nombre);
    }

    

    
    
}
