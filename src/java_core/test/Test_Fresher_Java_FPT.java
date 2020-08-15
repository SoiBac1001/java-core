package java_core.test;
import java.awt.*;

public class Test_Fresher_Java_FPT {
	public static void main(String[] args) {
//      int[] a;
//      int b[];
		boolean b1 = false;
		boolean b2 = false;
		if (b2 != b1 != b2) {
			System.out.println("Hello");
		} else {
			System.out.println(1 % 2); // 1
			System.out.println("Hi");
		}
		int a = 2017;
		System.out.println(a / 10.0); // 201.7
		if (a / 10.0 == 201.7) { // a/10.0 sẽ được ép kiểu sang float (double) mặc dù kiểu của a là int
			System.out.println("Hello");
		} else {
			System.out.println("Hi");
		}
		System.out.println("========");
//    ============================

		System.out.println(b1 + " " + a); // b1 = false
		while (b1 = !b1) { // !b1 là true. (!b1) gán cho b1 => b1 = true => điều kiện trong while(true) =>
							// while chạy được @@
			a++;
		}
		System.out.println(a); // 2018
		System.out.println("========");
//	    ============================
		
//		Đoạn code dưới sẽ k chạy gì cả (chạy thằng finally xong thì trở về thằng return và thoát luôn chương trình)
//		Đoạn code dưới sẽ chạy theo trình tự: a=2 => vào khối finally => return => kết thúc luôn chương trình => lệnh hiển thị sysout ở dưới sẽ k được thực thi
//		int a = 2017;
		try {
			a = 2;
			return;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// TODO: handle finally clause
			a = 3;
		}
		System.out.println(a);
	}
}

class A{
	public A() {
		System.out.println("Hello");
	}
}

class B extends A{

	public B() {
//		super(); // Ngầm hiểu ngay cả khi k có
		System.out.println("Hi");
//		super(); // Bắt buộc phải để super() ở câu lệnh đâu tiên
	}
}

class C extends Frame{
	static int k;
	public C() {
		  Button HelloBut=new Button("Hello");
	      Button ByeBut=new Button("Bye");
	      add(HelloBut);
	      add(ByeBut);
	      setSize(300,300); // 2 Button nằm chồng lên nhau
	      setVisible(true);
	}
	
	public static void main(String[] args) {
		B b = new B();
		int i = 2, j = 4;
		switch(i + j*2) {
			case 1:
			case 2:
				System.out.println("1 and 2");
				break;
			case 3:
			case 10:
				System.out.println("3 to 10");
		}
		
		String s1 = new String("Hello");
		String s2 = new String("there");
		String s3 = new String();
		s3 = s2 + s1;
		
		C c = new C();
		System.out.println(k); // k khai báo static thì mới in ra được kiểu này
//		System.out.println(c.k); // nếu ko khai báo static mà để là biến instance thì phải truy cập thông qua đối tượng và ngay trong chính class của nó vì biến này đang để private
								// nó sẽ in ra giá trị mặc định theo kiểu dữ liệu của nó
		
		System.out.println("\nMax value Byte: " + Byte.MAX_VALUE);
		System.out.println("Min value Byte: " + Byte.MIN_VALUE);
		
		System.out.println("Min value Short: " + Short.MIN_VALUE);
		
		System.out.println("Max value Integer: " + Integer.MAX_VALUE);
		System.out.println("Max value Integer: " + Integer.MIN_VALUE);
		System.out.println(Math.pow(-2, 31));
		System.out.println("===============");
		System.out.println(-1>>>2); // ra 1 số > 10
		System.out.println(4<<2); // 4*2^2 = 16
		System.out.println(4>>2); // 4/2^2 = 1
		System.out.println(1<<2); // 1*2^2 = 4
		
	}
}

