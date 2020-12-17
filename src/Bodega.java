
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public abstract class Bodega {
 private int Id ;
 private String Producto;
 private String Drescripcion;
 private Date Entrada;

    public Bodega(int Id, String Producto, String Drescripcion, Date Entrada) {
        this.Id = Id;
        this.Producto = Producto;
        this.Drescripcion = Drescripcion;
        this.Entrada = Entrada;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getDrescripcion() {
        return Drescripcion;
    }

    public void setDrescripcion(String Drescripcion) {
        this.Drescripcion = Drescripcion;
    }

    public Date getEntrada() {
        return Entrada;
    }

    public void setEntrada(Date Entrada) {
        this.Entrada = Entrada;
    }

    @Override
    public String toString() {
        return "Bodega{" + "Id=" + Id + ", Producto=" + Producto + ", Drescripcion=" + Drescripcion + ", Entrada=" + Entrada + '}';
    }
 
 
 abstract int CalcularAño();
}
