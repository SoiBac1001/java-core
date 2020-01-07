package algorithms.java;
/*
 * Thuật toán tìm kiếm nhị phân là phương pháp định vị phần tử x trong một danh sách arr[] gồm n phần tử đã được sắp xếp
 * TH mảng ngẫu nhiên thì sẽ ko biết được phần tử cần tìm sẽ nằm ở cận dưới hay cận trên
 * 
 * @author SoiBac1001
 */
public class Search_Algorithms {
	public static final int[] NUMBERS = {1,2,5,7,9,10};
	
	// Tìm kiếm nhị phân(Binary Search)
	public static int binary_Search(int[] arr, int x) { // tìm vị trí của x trong dãy arr[]
		int low = 0; // cận dưới của dãy khóa
		int high = arr.length - 1; // cận trên của dãy khóa
		int mid = (low + high)/2; // phần tử ở giữa
		
		// lặp trong khi cận dưới vẫn nhỏ hơn cận trên
		while(low <= high) { // TH số phần tử là CHẴN và phần tử cần tìm ở cuối danh sách thì vẫn xảy ra (low = high) - khi đó low=high=mid và chính là vị trí của số cần tìm => vẫn cần để đk =
			// nếu x lớn hơn phần tử ở giữa
			if(x > arr[mid]) { // TH số phần tử là CHẴN và phần tử cần tìm ko nằm trong danh sách thì vẫn xảy ra (low = high), sau đó low có thể +1, high có thể -1 dẫn tới low > high => return -1 => vẫn cần để đk =
				low = mid + 1; // cận dưới được đặt lên vị trí (mid + 1)
			}else if(x < arr[mid]) {
				high = mid - 1; // cận trên lùi về vị trí (mid - 1)
			}else {
				return mid; // đây chính là vị trí của x
			}
			mid = (low + high)/2; // xác định lại phần tử ở giữa
		}
		
		return -1; // không thấy x trong dãy khóa arr.
	}
	
	public static void main(String[] args) {
		System.out.println("Vị trí của phần tử có giá trị 10 là: " + binary_Search(NUMBERS, 10));

		for(int i=0; i<5; i++){
			try{
				if(i == 3){
					int b = 4/0;
				}
				System.out.println(i);
			}catch (Exception e){
				System.out.println(e);
			}
		}
	}

}
