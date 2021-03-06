/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io_doc_ghi_du_lieu_object;

import java.io.Serializable;

/**
 *
 * @author os_baonv
 */
public class SinhVien implements Serializable{ // Serializable giúp cho việc tuần tự hóa các dữ liệu // Nếu đối tượng thực hiện giao diện Serializable thì ta có thể sử dụng luồng đối tượng để đọc, ghi đối tượng đó
    private int tuoi; // ghi thông tin theo kiểu Object thì phải implements Serializable
    private String ten, diaChi;
    private double diemTB;

    public SinhVien(int tuoi, String ten, String diaChi, double diemTB) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien: " + ten + ", " + tuoi + ", " + diaChi + ", " + diemTB;
    }
    
}
