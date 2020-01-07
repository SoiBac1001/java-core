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
public class XeTai extends PTGT{
    private float trongTai;

    public XeTai() {
        trongTai = 0;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return (super.toString() + "\t\t " + trongTai);
    }
}
