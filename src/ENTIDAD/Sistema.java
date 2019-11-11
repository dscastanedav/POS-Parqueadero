/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author RENE
 */
public class Sistema {
    public  Parqueadero parqueaderoGeneral;
    public ArrayList <Administrador> administrador= new ArrayList<Administrador>();

    public ArrayList<Administrador> getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador admin) {
        System.out.println(admin.getUsuarioAdministrador());
        this.administrador.add(admin);
                
    }

    public Sistema() {
        
    }
}

