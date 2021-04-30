/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static prn215_grupo_4_4.frmLogin.us;

/**
 *
 * @author angel
 */
public class Usuario
{
    public static int id = 1;
    private int idUsuario;
    String nombreUsuario;
    String contraseña;

    public Usuario() {
        idUsuario = Usuario.id++;    }

    public Usuario(int idUuario, String nombreUsuario, String contraseña) {
        this.idUsuario = idUuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getIdUuario() {
        return idUsuario;
    }

    public void setIdUuario(int idUuario) {
        this.idUsuario = idUuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public static int buscar(String user, String pass)
    {
         for(int i = 0; i<us.size(); i++)
        {
            if(us.get(i).getNombreUsuario().equals(user) && us.get(i).getContraseña().equals(pass))
            {
                return i;
            }
        }
         return -1;
    }
}
