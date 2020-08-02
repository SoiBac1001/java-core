/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.oop.java_interface_va_abstract;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm.
 * Một lớp chỉ có thể kế thừa một lớp khác, nhưng được triển khai nhiều interface.
 * @author SoiBac1001
 */
public class Ca_Sau implements Dong_Vat_Duoi_Nuoc, Dong_Vat_Tren_Can{ // thể hiện đa kế thừa thông qua implements

    private String ten;
    private int tuoi;
    private static boolean foundTen = false;
    static Scanner sc = new Scanner(System.in);
    
    @Override
    public void move() {
        System.out.println("Run and swim"); // đa kế thừa kiểu này thì hàm move() của class Ca_Sau vẫn chỉ thực hiện 1 hành động duy nhất theo cách mà class Ca_Sau định nghĩa
    }
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
    
    public Ca_Sau() {
    }

    public Ca_Sau(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public static boolean isFoundTen() {
        return foundTen;
    }

    public static void setFoundTen(boolean foundTen) {
        Ca_Sau.foundTen = foundTen;
    }
    
    public void inputCaSau(){
        System.out.print("Nhap ten: ");
        setTen(sc.nextLine());
        System.out.print("Nhap tuoi: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
    }
    
    public void outputCaSau(){
        System.out.println("Ten: " + getTen());
        System.out.println("Tuoi: " + getTuoi());
    }
    
    public void timTen(String ten){
        if(this.ten.equalsIgnoreCase(ten)){
            foundTen = true;
            System.out.println("Ten, Tuoi:");
            System.out.println(toString());
        }       
    }
    
    public String toString(){
        return ten + "\t" + tuoi;
    }
    
    public static void main(String[] args) {
        ArrayList<Ca_Sau> list = new ArrayList<Ca_Sau>();
        Ca_Sau cs = new Ca_Sau();
        cs.move(); // Run and swim
        int lc = 0;
        Ca c = new Ca();
        Dong_Vat_Duoi_Nuoc dvdn;
        dvdn = c;
        c.move(); // Swim
        dvdn.move(); // Swim
        dvdn = cs;
        dvdn.move(); // Run and swim
//        while(true){
//            System.out.println("1. Nhap thong tin dan ca sau");
//            System.out.println("2. Hien thi thong tin dan ca sau");
//        }

        do{
            System.out.println("1. Nhap thong tin dan ca sau");
            System.out.println("2. Hien thi thong tin dan ca sau");
            System.out.println("3. Tim kiem ca sau theo ten");
            System.out.println("4. Sap xep dan ca sau theo do tuoi tang dan");
            System.out.println("5. Sap xep dan ca sau theo do tuoi giam dan");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Moi ban nhap: ");
            lc = sc.nextInt(); // hàm main là hàm static nên nếu muốn dùng biến sc ở ngoài thì sc phải là 1 biến static
            System.out.println("");
            sc.nextLine();
            switch(lc){
                case 1:{
                    for(int i=0; i<2; i++){
                        cs.inputCaSau();
                        list.add(cs);
                    }
                    break;
                }
                
                case 2:{
                    for(int i=0; i<list.size(); i++){
                        System.out.println(list.get(i));
                    }
                    break;
                }
                
                case 3:{
                    break;
                }
                
                case 0:{
                    System.exit(0);
                    break;
                }
            }
        }while(lc != 0);
          
    }

    @Override
    public String action() {
      // TODO Auto-generated method stub
      return null;
    }

    @Override
    public String food() {
      // TODO Auto-generated method stub
      return null;
    }
}
