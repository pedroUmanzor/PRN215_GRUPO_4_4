/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Cliente extends Persona{
    public static int id=1;
    private int idCliente;

    
       public Cliente(){
        idCliente=Cliente.id++;
    }
      
    public Cliente(int idCliente,String Nombre, String Apellido, String Direccion, String Telefono, String Dui){
        super(Nombre,Apellido,Direccion,Telefono,Dui);
        this.idCliente=idCliente;
    }
       public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
