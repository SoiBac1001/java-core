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
public class XeMay extends PTGT{
    private float congSuat;

    public XeMay() {
        congSuat = 0;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return (super.toString() + "\t " + congSuat); // super. gọi đến phương thức toString của lớp cha PTGT
    }
}
