/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import ENTIDAD.Administrador;
import ENTIDAD.Sistema;
import FRONTERA.FramePrincipal;
import FRONTERA.RegistroAdministrador;

/**
 *
 * @author danyy
 */
public class CrearAdministrador {

    private Sistema sistema = FramePrincipal.sistema;

    public CrearAdministrador() {

    }

    public String verificarLogin(Administrador administrador) {
        if (!verificarLongitudNombre(administrador.getUsuarioAdministrador())) {
            return ("Longitud nombre incorrecta");
        }
        if (!verificarLongitudPassword(administrador.getContraseñaAdministrador())) {
            return ("Longitud contraseña incorrecta");
        }
        System.out.println(sistema.getAdministrador().size());
        
        for (Administrador u : sistema.getAdministrador()) {
            if (u.getUsuarioAdministrador().equals(administrador.getUsuarioAdministrador()) && u.getContraseñaAdministrador().equals(administrador.getContraseñaAdministrador())) {
                return ("Ya Registrado");
            }
        }
        return ("Datos incorrectos");
    }

    public boolean verificarLongitudNombre(String nombre) {
        return (nombre.length() > 1 && nombre.length() <= 15);
    }

    public boolean verificarLongitudPassword(String password) {
        return (password.length() >= 3 && password.length() < 15);
    }
}
