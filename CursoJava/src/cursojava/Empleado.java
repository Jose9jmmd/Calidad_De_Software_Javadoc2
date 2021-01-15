/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 * Esta clase Empleado, es una clase extendida de la clase Persona, en esta clase 
 * hay un constructor, en el que hay creado una persona, y le asigna un numero de
 * empleado, en qué departamento esta, y por último en que puesto esta.
 * 
 * @author Jose Manuel Martinez Deltell
 * @version 1.0
 * @since 14/01/2021
 */
public class Empleado extends Persona{
    
    private int numeroEmpleado;
    private String departamento;
    private String puesto;

    
    
    /**
     * Este es el constructor. 
     * @param nombre es la variable del nombre de la persona.
     * @param edad es la variable de la edad de la persona.
     * @param sexo es la variable del sexo de la persona.
     * @param numeroEmpleado es la variable del número de empleado que le asignara a la persona.
     * @param departamento es la variable departamento que le asignara a la persona.
     * @param puesto es la variable puesto que le asignara a la persona.
     */
    
    public Empleado(String nombre,int edad,char sexo,int numeroEmpleado,String departamento,
        String puesto){
        
        super(nombre, edad, sexo);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;

    }
    
    /**
     * Este método es el que obtiene el número de empleado de los constructores.
     * @return devuelve el número de empleado que ha obtenido.
     */

    public int getNumeroEmpleado() {

        return numeroEmpleado;

    }
    
    /**
     * Este es un método constructor que crea un numero de Empleado.
     * @param numeroEmpleado esta variable ingresa un nuevo número de empleado. 
     */
    
    public void setNumeroEmpleado(int numeroEmpleado) {

        this.numeroEmpleado = numeroEmpleado;

    }

    /**
     * Este método es el que obtiene el departamento de los constructores.
     * @return devuelve el departamento que ha obtenido.
     */
    
    public String getDepartamento() {

        return departamento;

    }
    
    /**
     * Este es un metodo constructor que crea un departamento.
     * @param departamento esta variable ingresa un nuevo departamento.
     */

    public void setDepartamento(String departamento) {

        this.departamento = departamento;

    }
    
    /**
     * Este metodo es el que obtiene el puesto de los constructores.
     * @return devuelve el numero de empleado que ha obtenido
     */
    
    public String getPuesto() {

        return puesto;

    }
    
    /**
     * Este es un metodo constructor que crea un puesto.
     * @param puesto esta variable ingresa un nuevo departamento.
     */

    public void setPuesto(String puesto) {

        this.puesto = puesto;

    }

}
