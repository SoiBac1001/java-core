package java_oop.java_interface_va_abstract;

public class CaCom extends Ca implements Dong_Vat_Duoi_Nuoc { // CaCom extends Ca, Ca implements Dong_Vat_Duoi_Nuoc

	
	public static void main(String[] args) { // CaCom ko phải @Override lại phương thức move() và run() rồi nên CaCom ko bắt buộc phải @Override lại chúng (move() và run()) của Dong_Vat_Duoi_Nuoc nữa
		// TODO Auto-generated method stub
		
		Ca_Sau cs = new Ca_Sau();
		CaCom cc = new CaCom();
		Dong_Vat_Duoi_Nuoc dv = cs; // không khởi tạo đươc Dong_Vat_Duoi_Nuoc dv = new Dong_Vat_Duoi_Nuoc(); // Không thể tạo đối tượng từ lớp trừu tượng
        						   // dùng như 1 biến tham chiếu
		dv = cc;
	}

}
