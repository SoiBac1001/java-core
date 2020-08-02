package java_core.string;
/*
 * Thuật toán đảo ngược chuỗi bất kỳ:
   Chuỗi ban đầu ten = "Le Dinh Hai Son Tung Tuan"
   1. Cắt chuỗi ban đầu thành từng từ và cho vào mảng String[] temp // cắt bằng split("\\s+");
   2. Đặt lại giá trị của chuỗi ban đầu = ""
   3. Duyệt vòng for cho i chạy từ (temp.lengh - 1) đến 0 (từ vị trí cuối đến đầu của mảng temp[]):
	  3.1 Mỗi lần duyệt thì cộng dồn từ đó vào biến String ten: ten = temp[i] + " ";
   4. Output mong đợi: "Tuan Tung Son Hai Dinh Le"
   
 * @author SoiBac1001
 *
 */
public class Dao_nguoc_chuoi {

	public static void main(String[] args) {
		String ten = "Le Dinh Hai Son Tung Tuan";
		String[] temp = ten.split("\\s+");
		ten = "";
		for(int i=temp.length - 1; i >= 0; i--) {
			ten += temp[i] + " ";
		}
		System.out.println("Chuoi sau khi dao nguoc: " + ten);
	}

}
