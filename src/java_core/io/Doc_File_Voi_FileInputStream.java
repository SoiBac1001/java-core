package java_core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Doc_File_Voi_FileInputStream {
	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("demo.txt");
//			int i = fin.read();
//			System.out.println((char) i);
			
			int i=0;
			while((i = fin.read()) != -1) { // Đọc một ký tự và gán cho i. Trả về -1 nếu cuối luồng.
				System.out.print((char) i); // Hiển thị ký tự i (ép kiểu về kiểu ký tự)
			}
			
			System.out.println("Hello");
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
