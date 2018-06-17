/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Modelo.BD.MultasBD.ConsultaMultas;
import Modelo.BD.MultasVehiculosBD;
import Modelo.UML.MultasAPersonas;
import Modelo.UML.MultasEstablecidas;
import Vistas.*;
import java.sql.SQLException;
import java.util.ArrayList;
import static Vistas.InsertarMulta.arrayMultas;

/**
 *
 * @author 1gprogexa02
 */
public class DanielBarragues {
    static Inicio i;
    static InsertarMulta im;
    static ConsultarMultas cm;
    public static ArrayList ArrayMatriculaConsultaPropietario;
    public static ArrayList ArrayMatriculaYCodigo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        toInicio();
    }
    
    public static void toInicio(){
        i = new Inicio();
        i.setVisible(true);
    }
    
    public static void toInsertarMulta() throws SQLException, Exception{
        im = new InsertarMulta();
        im.setVisible(true);
    }
    
    public static void toConsultarMulta(){
        cm = new ConsultarMultas();
        cm.setVisible(true);
    }
    
    public static ArrayList ConsultarMultasEstablecidas() throws SQLException, Exception{
        ArrayList array = ConsultaMultas();
        return array;
    }
    
    public static String DescripcionMulta(int Index){
        MultasEstablecidas mm = (MultasEstablecidas) arrayMultas.get(Index);
        String string = mm.getDescripcion();
        return string;
    }
    
    public static void InsertarMulta(int Codigo, String Matricula) throws Exception{
        MultasVehiculosBD.InsertarVehiculoMultado(Codigo, Matricula, "2018-06-07");
    }
    
    public static void ConsultaMatricula(String dni) throws Exception{
        ArrayMatriculaConsultaPropietario = Modelo.BD.ConsultaPropietarioBD.ConsultaVehiculosConMultas(dni);
        ConsultaMulta(ArrayMatriculaConsultaPropietario);
    }
    
    public static void ConsultaMulta(ArrayList array) throws Exception{
        ArrayMatriculaYCodigo = new ArrayList();
        for (int j = 0; j < array.size(); j++) {
            MultasAPersonas map = (MultasAPersonas) array.get(j);
            Modelo.BD.MultasVehiculosBD.ConsultaVehiculosConMultas(map.getMatricula());
        }
        
    }
}
