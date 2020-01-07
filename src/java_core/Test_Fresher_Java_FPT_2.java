package java_core;

//import jdk.nashorn.internal.ir.ContinueNode;

public class Test_Fresher_Java_FPT_2 {
	final static short x = 2;
	public static int y = 0;
	static char c;
	static public void foo() {
		assert false;
		assert false;
	}
	
	static public void bar() {
		while(true) {
			assert false;
			break;
		}
		assert false; // k thể tới được do ở trên là while(true) => phải break; ở trên
	}
	
	void start() 
    {
        int a = 3;
        int b = 4;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(a + b); // 7
        System.out.print(" " + a + b + " "); // 34 do có chuỗi ở trước " " // chuỗi này cộng với a + b đằng sau thì a + b lúc này trở thành chuỗi 
        System.out.print(getChuoi() + a + b + " ");
        System.out.println(a + b + getChuoi());
    }
	
	String getChuoi() {
		return "foo";
	}
	
	public static void main(String[] args) {
		/*int a;
		int b = 0;
//		System.out.println(a); // Lỗi đọc giá trị biến trước khi được khởi tạo
		b++;
		System.out.println(b); // 1
		label:
			if(b < 3) {
				System.out.println("B is " + b);
				b++;
			}
		System.out.println("==================");*/
		for(int z=0; z<3; z++) {
			switch (z) { // x là biến final static x = 2 // x-i = z
			case x: System.out.print("0 ");
			case x-1: System.out.print("1 ");
			case x-2: System.out.print("2 "); // vòng lặp đầu z=0 => chỉ có TH x-2=z <=> 2-2 = 0
			default:
				break;
			}
		}
		int k = 0;
		k += 7;
		System.out.println("\n" + k); // 7
		foo();
		bar();
		System.out.println("==================");
		
		Test_Fresher_Java_FPT_2 test = new Test_Fresher_Java_FPT_2();
		test.start();
		
		System.out.println("==========");
		k += c; //
		System.out.println(c + c);
	}
}
