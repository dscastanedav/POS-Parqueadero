/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrador")

public class Administrador implements Serializable {

    private String usuarioAdministrador;
    private String contraseñaAdministrador;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Administrador() {

    }

    public Administrador(String usuarioAdministrador, String contraseñaAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
        this.contraseñaAdministrador = contraseñaAdministrador;
    }

    public String getUsuarioAdministrador() {
        return usuarioAdministrador;
    }

    public void setUsuarioAdministrador(String usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }

    public String getContraseñaAdministrador() {
        return contraseñaAdministrador;
    }

    public void setContraseñaAdministrador(String contraseñaAdministrador) {
        this.contraseñaAdministrador = contraseñaAdministrador;
    }

}
