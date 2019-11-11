/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import DAO.AdministradorDAO;
import ENTIDAD.Administrador;

/**
 *
 * @author danyy
 */
public class ValidarAdministrador {
    private AdministradorDAO dao = new AdministradorDAO();
    
    public ValidarAdministrador(){
        
    }
    
    public String verificarLogin (Administrador usuario){
        if (!verificarLongitudNombre(usuario.getUsuarioAdministrador())){
            return("Longitud nombre incorrecta");
        }
        if (!verificarLongitudPassword(usuario.getContraseñaAdministrador())){
            return ("Longitud contraseña incorrecta");
        }
/*        
        for (Usuario u: sistema.getUsuarios()){
            if (u.getNombre().equals(usuario.getNombre()) &&  u.getPassword().equals(usuario.getPassword())){
            return ("Bienvenido");            
        }
        }*/
    if (dao.leer(usuario) != null){
        return("Bienvenido");
    }        
    
        return ("Datos incorrectos");
    }
    
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length() > 1 && nombre.length() <= 6);
    }
    
    
    
    public boolean verificarLongitudPassword(String password){
         return (password.length() >= 3 && password.length() < 6);
    }
}
