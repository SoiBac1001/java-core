/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_than_trieu;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Than
 */
public class QLPTGT {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<PT> list;
    public QLPTGT(){
        list = new ArrayList();
    }
    
    public ArrayList getArrayList(){
        return list;
    }
    
    public static void main(String[] args) {
        QLPTGT ex = new QLPTGT();
        
        
        int lc;
        do{
            System.out.println("Nhap cac lua chon: \n0_Thoat.\n1_Nhap Xe may."
                    + "\n2_Nhap Oto.\n3_Nhap xe tai.\n4_Xuat thong tin cac ptgt."
                    + "\n5_Tim kiem ptgt theo hang san xuat.\n6_Tim theo khoang gia."
                    + "\nBan chon ? ");
            lc = sc.nextInt();
            switch(lc){
                case 0: break;
                case 1:{
                    ex.nhapXeMay();
                    break;
                }
                case 2:{
                    ex.nhapOto();
                    break;
                }
                case 3:{
                    ex.nhapXeTai();
                    break;
                }
                case 4:{
                    ex.display(ex.getArrayList());
                    break;
                }
                case 5:{
                    System.out.println("Nhap ten hang can tim: ");
                    ex.timKiemTheoHangSX(sc.next());
                    break;
                }
                case 6:{
                    System.out.println("tim theo khoang gia: ");
                    System.out.println("nhap gia tu ?$ toi ?$");
                    ex.timKiemTheoGia(sc.nextInt(), sc.nextInt());
                    break;
                }
            }
        } while(lc != 0);
        
    }
    
      private PTGT nhapPTGT(){
          PTGT p = new PTGT();
          System.out.println("Nhap Hang: ");
          p.setHang(sc.next());
          System.out.println("Nam SX: ");
          p.setNamSX(sc.nextInt());
          System.out.println("Gia: ");
          p.setGiaBan(sc.nextInt());
          System.out.println("Mau: ");
          p.setColor(sc.next());
          return p;
      }
      
      public void nhapXeMay(){
          PTGT p = nhapPTGT();
          XeMay x = new XeMay();
          System.out.println("Cong suat: ");
          x.setCongSuat(sc.nextInt());
          x.setColor(p.getColor());
          x.setGiaBan(p.getGia());
          x.setNamSX(p.getNamSX());
          x.setHang(p.getHang());
          list.add(x);
      }
      
      public void nhapOto(){
          PTGT p = nhapPTGT();
          Oto x = new Oto();
          System.out.println("So cho: ");
          x.setSoCho(sc.nextInt());
          System.out.println("Kieu DC: ");
          sc.nextLine();
          x.setKieuDC(sc.nextLine());
          x.setColor(p.getColor());
          x.setGiaBan(p.getGia());
          x.setNamSX(p.getNamSX());
          x.setHang(p.getHang());
          list.add(x);
      }
      
      public void nhapXeTai(){
          PTGT p = nhapPTGT();
          XeTai x = new XeTai();
          System.out.println("Trong Tai: ");
          x.setTT(sc.nextDouble());
          x.setColor(p.getColor());
          x.setGiaBan(p.getGia());
          x.setNamSX(p.getNamSX());
          x.setHang(p.getHang());
          list.add(x);
      }
      
      public void display(ArrayList<PT> arr){
          System.out.println("Hang\t Nam SX\t Mau\t Gia\tC.Suat.\tT.Tai\t S.Cho\t KieuDC");
          for(PT p: arr){
              System.out.println(  p.toString());
          }
          System.out.println("");
      }
      
      public void timKiemTheoHangSX(String s){
          ArrayList<PT> arr = new ArrayList();
          for(PT p:list){
              for (int i = 0; i <= ((PTGT)p).getHang().length()-s.length(); i++) {
                  if(s.compareToIgnoreCase(((PTGT)p).getHang().substring(i, i+s.length())) == 0)
                      arr.add(p);
              }
          }
          if(arr.size() == 0) System.out.println("Khong tim thay hang ban muon.");
          else display(arr);
      }
      
     public void timKiemTheoGia( int from, int to ){
          ArrayList<PT> arr = new ArrayList();
          for(PT p:list){            
                  if(((PTGT)p).getGia() >= from && ((PTGT)p).getGia()<= to )
                      arr.add(p);
          }
          if(arr.size() == 0) System.out.println("Khong tim thay PT trong khoang gia ban muon.");
          else display(arr);
      } 
    
}
