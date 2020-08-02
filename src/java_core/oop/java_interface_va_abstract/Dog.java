package java_core.oop.java_interface_va_abstract;

public abstract class Dog implements Dong_Vat_Tren_Can{ // Trừ khi một lớp triển khai interface là lớp trừu tượng abstract, còn lại tất cả các phương thức của interface cần được định nghĩa trong class
	// Do class dog là class trừu tượng abstract nên ko phải triển khai method của interface Dong_Vat_Tren_Can
	// Một lớp triển khai chính nó có thể là abstract và vì thế các phương thức interface không cần được triển khai.
	
	@Override // abstract class Dog triển khai method move() của Dong_Vat_Tren_Can interface
	public void move() { // Abstract class có thể cung cấp nội dung cài đặt cho phương thức của interface.
		System.out.println("Go...");
	}
	
	public static void main(String[] args) {
		Mouse.main(args);
	}
}

class Mouse extends Dog{
	@Override
	public void eat() { // Mouse extends Dog, mà Dog @Override move() rồi nên Mouse chỉ cần @Override eat()
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.move(); // Go... // sẽ gọi đến hàm move() đã được abstract class Dog triển khai
	}
}
