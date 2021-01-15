/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 * Esta clase Persona, es una clase una superclase de la clase Empleado, en esta clase 
 * hay un constructor, en el que se crea una persona, y le asigna un nombre, edad y sexo.
 * 
 * @author Jose Manuel Martinez Deltell
 * @version 1.0
 * @since 14/01/2021
 */
public class Persona {
   
    String nombre;
    int edad;
    char sexo;
    
    /**
     * Este método es el constructor.
     * @param nombre la variable de la persona que indica como se llama.
     * @param edad la variable de la persona que indica que edad tiene.
     * @param sexo la variable de la persona que indica de que genero es.
     */
    Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
}
