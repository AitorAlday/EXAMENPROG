/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author 1gprogexa13
 */
public class Excepcion extends Exception {
    private int x;

    public Excepcion(int x) {
        this.x = x;
    }
    
    @Override
    public String getMessage (){
        String mensaje= String.valueOf(x)+"  ";
        switch(x){
            case 1:
                mensaje+= "No se ha podido conectar a la base de datos";
                break;
            case 2:
                mensaje +="El campo no puede estar vacio";
                break;
            case 3:
                mensaje +="Por favor selecciona una de las opciones disponibles";
                break;
            case 4:
                mensaje +="El alumno ya esta matriculado en esta asignatura";
                break;
            case 5:
                mensaje +="El nombre no puede estar vacio";
                break;
            case 6:
                mensaje +="El dni del alumno no puede estar vacio";
                break;
            case 7:
                mensaje +="El alumno tiene que matricularse al menos en una asignatura";
                break;
            case 8:
                mensaje +="Una de las dos opciones de busqueda tiene que estar seleccionada";
                break;
            case 9:
                mensaje +="No ha habido resultados para el nombre dado.";
                break;
            case 10:
                mensaje +="El dni es incorrecto (xxxxxxxxL)";
                break;
        }
       return mensaje;
    }
    
}
