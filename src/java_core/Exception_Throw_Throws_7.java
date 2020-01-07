/**
 * Khi override một phương thức của lớp cha, phương thức ở lớp con không được phép tung ra các ngoại lệ mới
 * Phương thức ghi đè trong lớp con chỉ được phép tung ra các ngoại lệ giống hoặc là lớp con hoặc là tập con của các ngoại lệ được tung ra ở lớp cha.
 */
package java_core;

import java.io.EOFException;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws_7 {
    public static void myMethod(int tuoi, String ten) throws ArithmeticException, NullPointerException{
        if(tuoi < 18){
            throw new ArithmeticException("Chua du tuoi");
        }
        else if(ten == null){
            throw new NullPointerException("Thieu ten");
        }
    }
    
//    void readFile() throws EOFException{
//        
//    }
    
    void readFile() throws IOException{
        
    }
    
    public static void main(String[] args) {
        try {
            myMethod(9,"");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

    }
}

class test extends Exception_Throw_Throws_7{
//    @Override
//    void readFile() throws IOException{ // k được do ngoại lệ của lớp con > ngoại lệ của lớp cha
//        
//    }
    
    @Override
    void readFile() throws EOFException{ // ok
        
    }
}
