
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FabricioNicolas
 */
public class TiempoEnAños extends Bodega {
    
    private int Efecha ;

    public TiempoEnAños(int Id, String Producto, String Drescripcion, Date Entrada) {
        super(Id, Producto, Drescripcion, Entrada);
    }

    public int getFecha() {
        return Efecha;
    }

    public void setFecha(int fecha) {
        this.Efecha = fecha;
    }
    

    @Override
    int CalcularAño() {
        LocalDate cambiof=this.getEntrada().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter date= DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
       LocalDate fechaactual=LocalDate.now();
       Period anos = Period.between(cambiof, fechaactual);
       int resultado= anos.getYears();
       return resultado;
    }
    
    
}
