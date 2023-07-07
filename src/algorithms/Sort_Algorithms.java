package algorithms;

public class Sort_Algorithms {
	public static final int[] NUMBERS = {5,1,12,-5,2,16};
	
	// Sắp xếp nổi bọt (Bubble sort)
	public static void bubble_Sort(int[] numbers) {
		for(int i=0; i < numbers.length - 1; i++) { // duyệt (numbers.length - 1) lần, bên cạnh đó còn dùng để trừ đi các phần tử lớn nhất mình đã cho xuống cuối ds
			boolean check = true; // thêm cái này nếu dãy đã đc SX rồi thì k SX nữa @@
			for(int j=0; j < numbers.length - 1 - i; j++) { // i=0 thì j chạy tối đa tới 3 // nếu vòng for đầu tiên cho i chạy < numbers.length (tức tối đa i = numbers.length - 1) thì vòng for dưới j chạy < 0 => sẽ ko bao giờ chạy được => thừa
				if(numbers[j] > numbers[j+1]) { // i=3 thì j chạy tối đa tới 0
					int temp = numbers[j]; // nôm na chỉ cho j chạy < numbers.length - 1 (tức tối đa j = numbers.length - 2) vì còn kiểm tra numbers[j+1] nữa
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					check = false;
				}
			}
			if(check) // check = true;
				break;
		}
		
		
		/*for(int i=numbers.length - 1; i > 0; i--) {
			for(int j=0; j < i; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}*/
		
		System.out.print("Blubble sort: ");
		displayArr();
	}
	
	// Sắp xếp lựa chọn (Selection sort)
	public static void selection_Sort(int[] numbers) {
		int min_position = 0;
		for(int i=0; i < numbers.length - 1; i++) { // duyệt các phần tử i=0,1,.., n-2
			min_position = i; // gọi min_position là vị trí của phần tử nhỏ nhất trong dãy con và gán cho thằng đầu tiên của dãy con chưa SX là nhỏ nhất
			for(int j=i+1; j < numbers.length; j++) { // duyệt từ phần tử tiếp theo j=i+1,..,n-1
				if(numbers[j] < numbers[min_position]) { // nếu numbers[min_position] không phải nhỏ nhất trong dãy con
					min_position = j; // ghi nhận đây mới là vị trí phần tử nhỏ nhất			
				}
			}
			// Nếu min_position khác i thì đặt phần tử nhỏ nhất vào vị trí đầu tiên của dãy con chưa được sắp xếp
			if(min_position != i) {
				int temp = numbers[i];
				numbers[i] = numbers[min_position];
				numbers[min_position] = temp;
			}
		}
		System.out.print("Selection sort: ");
		displayArr();	
	}
	
	public static void displayArr() {
		for (int i : NUMBERS) {
			System.out.print(i + " ");
		}
	}
	
	/*public static void swap(int a, int b) { // ko được do đang truyền tham trị => nó chỉ có ảnh hưởng trong hàm swap()
		int c = a;
		a = b;
		b = c;
	}*/
	
	public static void main(String[] args) {
	  System.out.print("Origin array: ");
	  displayArr();
	  System.out.println("\n=======================");
	  
//		bubble_Sort(NUMBERS);
		selection_Sort(NUMBERS);
	}

}
