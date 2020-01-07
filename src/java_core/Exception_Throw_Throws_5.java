/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Có hai trường hợp:

TH1: Bạn đã bắt ngoại lệ, tức là xử lý ngoại lệ bằng cách sử dụng try/catch.
TH2: Bạn khai báo ném ngoại lệ, tức là sử dụng từ khóa throws với phương thức.
 * @author os_baonv
 */

// TH1: Bạn đã bắt ngoại lệ, tức là xử lý ngoại lệ bằng cách sử dụng try/catch.

class TestThrows{
    void method() throws IOException{ // ngoại lệ liên quan đến đọc, ghi
        throw new IOException("Loi thiet bi");
    }
}

public class Exception_Throw_Throws_5 {
    
    public static void main(String[] args) {
        TestThrows t = new TestThrows();
        try {
            t.method();
        } catch (IOException ex) {
//            Logger.getLogger(Exception_Throw_Throws_5.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ngoai le duoc xu ly");
        }
    }
}


// TH2: Khai báo throws ngoại lệ
/*
class TestThrows{
    void method() throws IOException{
//        System.out.println("Thiet bi dang hoat dong tot");
        throw new IOException("Thiet bi");
    }
}
public class Exception_Throw_Throws_5{
    public static void main(String[] args) throws IOException {
        TestThrows t = new TestThrows();
        try {
            t.method();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Luong binh thuong");
    }
}
*/