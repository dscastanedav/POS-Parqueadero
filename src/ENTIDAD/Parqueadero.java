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
public class Parqueadero {

    private String razonSocial;
    private String nit;
    private String regimen;
    private String direccion;
    private String teleono;
    private String poliza;
    private Boolean tipoAutomovil=true;
    private Boolean tipoMotos=true;
    private Boolean tipoBici=true;
    private Double precioAutomovil;
    private Double precioMotos;
    private Double precioBici;

    public Parqueadero(String razonSocial, String nit, String regimen, String direccion, String teleono, String poliza ) {
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.regimen = regimen;
        this.direccion = direccion;
        this.teleono = teleono;
        this.poliza = poliza;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTeleono() {
        return teleono;
    }

    public void setTeleono(String teleono) {
        this.teleono = teleono;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public Boolean getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(Boolean tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Boolean getTipoMotos() {
        return tipoMotos;
    }

    public void setTipoMotos(Boolean tipoMotos) {
        this.tipoMotos = tipoMotos;
    }

    public Boolean getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(Boolean tipoBici) {
        this.tipoBici = tipoBici;
    }

    public Double getPrecioAutomovil() {
        return precioAutomovil;
    }

    public void setPrecioAutomovil(Double precioAutomovil) {
        this.precioAutomovil = precioAutomovil;
    }

    public Double getPrecioMotos() {
        return precioMotos;
    }

    public void setPrecioMotos(Double precioMotos) {
        this.precioMotos = precioMotos;
    }

    public Double getPrecioBici() {
        return precioBici;
    }

    public void setPrecioBici(Double precioBici) {
        this.precioBici = precioBici;
    }

}
