/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 *
 * @author angel
 */
public class Empleado extends Persona {
    public static int id = 1;
    private String cargo;
    private int idEmpleado;
    
        public Empleado() {
        idEmpleado = Empleado.id++;
    }
        
        public Empleado(String cargo, int idEmpleado, String Nombre, String Apellido, String Direccion, String Telefono, String Dui) {
        super(Nombre, Apellido, Direccion, Telefono, Dui);
        this.cargo = cargo;
        this.idEmpleado = idEmpleado;
        
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
}
