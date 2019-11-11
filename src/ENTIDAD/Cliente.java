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
public class Cliente {
    private String placa;
    private Integer puntos;

    public Cliente(String placa, Integer puntos) {
        this.placa = placa;
        this.puntos = puntos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    
}
