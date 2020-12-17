
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maty
 */
public class conexionsql {
    
  
    
    Connection conectar =null;
    public Connection conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bodega","root","1234");
        
    }catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de Conexion "+e.getMessage());
    }
    return conectar;
    }
    
}
