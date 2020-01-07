/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_work2;

import java.io.Serializable;

/**
 *
 * @author os_baonv
 */
public class PTGT implements PT, Serializable{ // Serializable để đọc ghi Object
    protected String hangSX;
    protected int namSX;
    protected double giaBan;
    protected String mau;

    public PTGT() {
        namSX = 0;
        giaBan = 0;
        hangSX = mau = "";
        
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
//    @Override
//    public String toString(){ // trả về biểu diễn chuỗi của đối tượng
//        return (""); // hàm biểu diễn đối tượng dưới dạng chuỗi
//    }

    @Override
    public String toString() { // trả về biểu diễn chuỗi của đối tượng // hiển thị đối tượng
        return (hangSX + "\t " + namSX + "\t " + mau + "\t " + giaBan); // hàm biểu diễn đối tượng dưới dạng chuỗi
    }
}
