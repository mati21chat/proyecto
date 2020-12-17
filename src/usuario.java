/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maty
 */
public class usuario {
    private String rut;
    private String password;

  
    public usuario(String rut, String password) {
        this.rut = rut;
        this.password = password;
    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "usuario{" + "rut=" + rut + ", password=" + password + '}';
    }

  
    
}
