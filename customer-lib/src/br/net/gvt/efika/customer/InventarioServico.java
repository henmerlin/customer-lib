/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer;

/**
 *
 * @author G0042204
 */
public class InventarioServico {

    private Long velDown, velUp;

    private Boolean isSip, isHib;

    public InventarioServico() {
    }

    public Long getVelDown() {
        return velDown;
    }

    public void setVelDown(Long velDown) {
        this.velDown = velDown;
    }

    public Long getVelUp() {
        return velUp;
    }

    public void setVelUp(Long velUp) {
        this.velUp = velUp;
    }

    public Boolean getIsSip() {
        return isSip;
    }

    public void setIsSip(Boolean isSip) {
        this.isSip = isSip;
    }

    public Boolean getIsHib() {
        return isHib;
    }

    public void setIsHib(Boolean isHib) {
        this.isHib = isHib;
    }

}
