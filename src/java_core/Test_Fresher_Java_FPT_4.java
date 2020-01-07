package java_core;

import java.util.Scanner;

public class Test_Fresher_Java_FPT_4 {
	static Scanner sc = new Scanner(System.in);
	
	public static void checkNumbers() { // đếm số các số chia hết cho 5 và có chữ số hàng phần trăm là số lẻ
		int n = 0, i = 0; // cần khởi tạo giá trị mặc định cho biến cục bộ trước khi có thể sử dụng.
		int temp = 0;
		System.out.print("Nhap so luong phan tu mang: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		
		/*for(i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}*/
		
		// Nhập các phần tử mảng
		/*do {
			if(arr[i] > 999) {
				i++;
				if(i == n) {
					break;
				}
			}
				
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextInt();
		}while(i < n);*/
		
		while(i<n) {
			do {
				System.out.print("arr[" + i + "]: ");
				arr[i] = sc.nextInt();
			}while(arr[i] > 999 && ++i < n);
		}
		
//		i = 0; // set lại về 0 // dùng cho việc KO hiển thị ", " lần đầu ở phía dưới
		temp = 0;
		System.out.print("Mang vua nhap: ");
		for(int so : arr) {
			/*String s = (temp++ > 0) ? (", " + so):("" + so);
			System.out.print(s);*/
			System.out.print((temp++ > 0) ? (", " + so) : so);
		}
		
		int count = 0; // đếm số các số t/m y/c bài
		System.out.print("\nCác số t/m y/c bài là: ");
		for (int so : arr) {
			if(so % 5 == 0) {
				temp = so / 100;
				if(temp % 2 == 1) {
					/*String s = (count++ > 0) ? (", " + so) : ("" + so);
					System.out.print(s);*/
					System.out.print((count++ > 0) ? (", " + so) : so);
				}
			}
		}
		
		System.out.println("\nSố các số t/m y/c bài là: " + count);
		System.out.println("=============");
	}
	
	public static void printStar() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i == 0 || i == 7) {
					System.out.print("*");
				} // Do đk else if nên loại đc 2 TH thừa i=j=0 và i=j=7
				/*else if(i == j) { // else if(i == j && i != 0 && i != 7) // nếu để if(i == j) thì nó sẽ thêm 2 ký tự "*" vào 2 TH (i=0 || i=7) => ko thêm vào
					System.out.print("*");
				}else {
					System.out.print(" ");
				}*/
				else { // Code thế này rõ ràng hơn // else là loại TH i=0 và i=7
					if(i == j) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				
				/*else if(i == 1) {
					if(j == 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else if(i == 2) {
					if(j == 2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else if(i == 3) {
					if(j == 3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else if(i == 4) {
					if(j == 4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else if(i == 5) {
					if(j == 5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				else if(i == 6) {
					if(j == 6) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}*/
			}
			
			System.out.println(); // Xuống dòng
		}
	}
	
	// In HCN
	public static void printRectangle() {
		for(int i=0; i<6; i++) {
			for(int j=0; j<10; j++) {
				if(i == 0 || i == 5) {
					System.out.print("*");
				}else {
					if(j == 0 || j == 9) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void test() {
		long t = 0;
		double d = 5.6;
		t += d; // tự động ép kiểu về kiểu long nên gán được kiểu này <=> t += (long) d;
		t = (long) (t + d); // ko tự động ép kiểu về kiểu long nên ta phải thực hiện ép kiểu (long)
		System.out.println(t); // 10
		t -= 0.1;
		System.out.println(t); // 9
		System.out.println("========");
	}
	
	public static void main(String[] args) {
		checkNumbers();
		printStar();
		System.out.println();
		printRectangle();
		test();
		
		double a = 60*1.1;
		System.out.println(a);
		double b = a*1.1;		
		System.out.println(b);
		
		int[] arr1 = {3,2,1};
		int[] arr2 = arr1;
		System.out.println(arr2[2]);
//		System.out.println(arr2);
	}

}
