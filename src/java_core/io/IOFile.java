/**
 * Muốn xóa folder thì phải xóa từng file
 */
package java_core.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author 13a0_pr0_96
 */
public class IOFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\13a0_pr0_96\\Desktop\\JAVA");
//        f.createNewFile(); // tạo file
        System.out.println("Duong dan tuyet doi cua file: " + f.getAbsolutePath());
        System.out.println("Kich thuoc file: " + f.length());
        System.out.println("Last modify date " + new Date(f.lastModified()));
        System.out.println("File co the doc hay k ? " + f.canRead());
//        File f1 = new File("C:\\Users\\13a0_pr0_96\\Desktop\\JAVA\\Test.pdf"); 
//        f.renameTo(f1);
//        f.delete(); // xóa file

//        for(File a : f.listFiles()){
//            System.out.println(a.getName()); // duyệt toàn bộ thư mục JAVA và show ra tên của các file
//        }

        File f1 = new File("C:\\Users\\13a0_pr0_96\\Desktop\\JAVA\\test"); // tạo folder test
//        f1.mkdirs(); // tạo folder
//        f1.createNewFile(); // tạo file .doc .pdf .txt - tùy kiểu mà ta đặt
        for(File a : f1.listFiles()){ // duyệt và xóa toàn bộ file trong folder test
            a.delete();
        }
        f1.delete();
    }
}
