/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.oop.java_interface_va_abstract;

/*
 * Nguồn: http://viettuts.vn/java/interface-trong-java
 * Một interface không thể chứa một trường nào trừ các trường vừa static và final.
 * Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.
 * Một interface có thể kế thừa từ nhiều interface khác
 * Mọi phương thức, property trong interface đều mặc định là public.
 * @author SoiBac1001
 */
public interface Dong_Vat_Duoi_Nuoc extends Dong_Vat, Dong_Vat_Tren_Can, Hanh_Dong{ // không thể khởi tạo interface Dong_Vat_Duoi_Nuoc dv = new Dong_Vat_Duoi_Nuoc();
	int a = 5; // mặc định là biến static final // Mọi phương thức, property đều mặc định là public.
	void move(); // mặc định là abstract
	
	@Override
	default void run() { // ? // cung cấp triển khai method run() từ Dong_Vat interface thì cũng ko giải quyết được gì
		// TODO Auto-generated method stub
		System.out.println("oh");
	}

	default void print(String string) {
		if (!isNull(string))
			System.out.println("ThirdInterface Print::" + string);
	}

	static boolean isNull(String string) {
		System.out.println("Interface Null Check");

		return string == null ? true : "".equals(string) ? true : false;
	}
}
