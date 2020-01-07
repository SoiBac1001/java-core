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
public class TaiKhoanNganHang {
    double soDu;
    public void guiTien(double tienGui){
        soDu += tienGui;
    }
    public double getSoDu(){
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    
    public void rutTien(double tienRut) throws LoiChuyenTien{
        if(soDu > tienRut)
            soDu = soDu - tienRut;
        else
            throw new LoiChuyenTien(tienRut); // hàm tạo của class ngoại lệ tự định nghĩa có tham số
    }
}
