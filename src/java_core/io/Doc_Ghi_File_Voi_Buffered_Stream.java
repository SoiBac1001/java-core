/**
 * Lớp wrapper cho byte stream:
 *  1. BufferedInputStream
 *  2. BufferedOutputStream
 
 * Lớp wrapper cho character stream
 *  1. BufferedReader
 *  2. BufferedWriter
 */
package java_core.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author os_baonv
 */
public class Doc_Ghi_File_Voi_Buffered_Stream {
    public static void main(String[] args) throws IOException {
        // Ví dụ: Sử dụng Wrapper cho byte stream
        /*
        BufferedInputStream bfIn = null;
        BufferedOutputStream bfOut = null;
        try {
            InputStream is = new FileInputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\input.txt");
            OutputStream os = new FileOutputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\output.txt");
            bfIn = new BufferedInputStream(is);
            bfOut = new BufferedOutputStream(os);
            int c;
            while((c = bfIn.read()) != -1) // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
                bfOut.write(c); // Ghi ký tự c được biểu diễn bằng số nguyên
        } finally {
            if(bfIn != null)
                bfIn.close();
            if(bfOut != null)
                bfOut.close();
        }
        */       

        // Ví dụ: Sử dụng Wrapper cho character stream
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try{
            FileReader r = new FileReader("E:\\Project\\work\\Fresher Java\\Java Core + Thread\\Java_Core\\src\\java_core\\io\\source\\input.txt");
            FileWriter w = new FileWriter("E:\\Project\\work\\Fresher Java\\Java Core + Thread\\Java_Core\\src\\java_core\\io\\source\\output.txt", true);
            bfr = new BufferedReader(r);         
            bfw = new BufferedWriter(w);
            int c;
            /*while((c = bfr.read()) != -1) { // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
                System.out.println(c);
                bfw.write(c); // Ghi ký tự c được biểu diễn bằng số nguyên
                break;
            }*/

            String line;
            while((line = bfr.readLine()) != null) { // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
                System.out.println(line);
                bfw.write("\n" + line); // Ghi ký tự c được biểu diễn bằng số nguyên
            }
        } finally{
            if(bfr != null)
                bfr.close();
            if(bfw != null)
                bfw.close();
        }
        
    }
}
