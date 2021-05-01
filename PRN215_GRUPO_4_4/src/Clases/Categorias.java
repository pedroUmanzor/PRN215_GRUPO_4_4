
package Clases;


public class Categorias {
    public static int id = 1;
    private int idCategoria;
    private String nombreCategoria;
    
    public Categorias(){
        idCategoria=Categorias.id++;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCateria) {
        this.nombreCategoria = nombreCateria;
    }
    
    
}
