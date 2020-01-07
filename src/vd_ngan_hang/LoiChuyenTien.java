/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_ngan_hang;

/**
 *
 * @author os_baonv
 */
public class LoiChuyenTien extends Exception{
    double tienRut;

    public LoiChuyenTien(double tienRut) {
        this.tienRut = tienRut;
    }

    @Override
    public String toString() {
        return "WARNING: So tien" + tienRut + "can rut lon hon so du hien co !";
    }
}
