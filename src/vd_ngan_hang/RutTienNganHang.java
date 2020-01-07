/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_ngan_hang;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class RutTienNganHang {
    public static void main(String[] args) {
        double tienGui, tienRut;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so tien gui:");
        tienGui = in.nextDouble();
        TaiKhoanNganHang tk = new TaiKhoanNganHang();
        tk.guiTien(tienGui); // set soDu += tienGui
        System.out.println("Tai khoan truoc khi rut: " + tk.getSoDu());
        System.out.println("Nhap so tien can rut: ");
        tienRut = in.nextDouble();
        try {
            tk.rutTien(tienRut); // cần try...catch chỗ này vì hàm rutTien ném ra 1 ngoại lệ LoiChuyenTien
            System.out.println("So du rut: " + tk.getSoDu());
        } catch (LoiChuyenTien ex) {
            System.out.println(ex.getMessage());
        }      
    }
}
