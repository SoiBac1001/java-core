/**
 * Khai báo trong class hoặc ngoài class nhưng không được khai báo trong phương thức
 * enum tương tự như lớp
 * lai giữa mảng và đối tượng
 */
package java_core;

/*
 * Nguồn: http://viettuts.vn/java-new-features/enum-trong-java
 * https://www.tutorialspoint.com/java/java_enumeration_interface.htm
 * @author os_baonv
 */

//enum COLOR{RED, YELLOW, BLUE}

public class Enum_Java {
	
	// Enum có thể có các trường, phương thức và Constructor
    enum COLOR{
    	RED(5), YELLOW(2), BLUE(10);
    	private int value;

		private COLOR(int value) { // Constructor của enum trong java là private. Khi bạn không khai báo là private thì trình biên dịch sẽ tạo ra Constructor private.
			this.value = value;
		}
    	
    }
    
    public static void main(String[] args) {
        System.out.println(COLOR.BLUE); // BLUE
        COLOR c = COLOR.RED;
        System.out.println(c); // RED
        System.out.println(c.YELLOW); // YELLOW
        if(c == COLOR.RED){
            System.out.println("True");
        }else {
        	System.out.println("False");
        }
        System.out.println("=============");
        
        for(COLOR color : COLOR.values()) { // COLOR colors[] = COLOR.values(): trả về một mảng chứa tất cả các giá trị của enum
        	System.out.println(color + " " + color.value);
        }
    }
}
