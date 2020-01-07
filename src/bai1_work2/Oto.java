/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_work2;

/**
 *
 * @author os_baonv
 */
public class Oto extends PTGT{
    private String kieuDongCo;
    private int soChoNgoi;

    public Oto() {
        kieuDongCo = "";
        soChoNgoi = 0;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public String toString() {
        return (super.toString() + "\t\t\t " + soChoNgoi + "\t" + kieuDongCo);
    }
}
