/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

/**
 *
 * @author RENE
 */
public class Operador {    
    private String usuarioOperario;
    private String contraseñaOperario;

    public Operador(String usuarioOperario, String contraseñaOperario) {
        this.usuarioOperario = usuarioOperario;
        this.contraseñaOperario = contraseñaOperario;
    }

    public String getUsuarioOperario() {
        return usuarioOperario;
    }

    public void setUsuarioOperario(String usuarioOperario) {
        this.usuarioOperario = usuarioOperario;
    }

    public String getContraseñaOperario() {
        return contraseñaOperario;
    }

    public void setContraseñaOperario(String contraseñaOperario) {
        this.contraseñaOperario = contraseñaOperario;
    }
    
}


