/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.oop.java_interface_va_abstract;

/**
 *
 * @author SoiBac1001
 */
public class Ca implements Dong_Vat_Duoi_Nuoc{ // Do Dong_Vat_Duoi_Nuoc extends Dong_Vat nên trong class Ca cũng phải @Override run()

    @Override
    public void move() {
        System.out.println("Swim");
    }

	@Override // do Ca đã @Override run() rồi nên run() trong Dong_Vat_Duoi_Nuoc k có ý nghĩa gì ngay cả khi nó triển khai run() trong đó
	public void run() {
		System.out.println("Boi...");
		
	}

    public boolean isNull(String string) {
        System.out.println("Impl Null Check");

        return string == null ? true : false;
    }

    public static void main(String[] args) {
		Ca ca = new Ca();
		ca.print("");
		ca.isNull("abc");
		ca.run(); // Boi...
		Dong_Vat_Duoi_Nuoc dv = ca;
		dv.run(); // Boi...
		dv.eat(); // Eating...
		dv.action(); // Action...
		
		Dong_Vat_Duoi_Nuoc dv2 = new Ca(); // dv2 là 1 thể hiện (instanceof) của Ca // và dv2 sẽ thực hiện được các phương thức của nó // muốn thực hiện thêm các phương thức của Ca thì phải ép kiểu dv2 về Ca
		dv2.run(); // Boi...
		System.out.println(dv2 instanceof Ca); // true
	}

  @Override
  public void eat() {
    System.out.println("Eating...");
  }

  @Override
  public String action() {
    System.out.println("Action...");
    return null;
  }

  @Override
  public String food() {
    System.out.println("Food...");
    return null;
  }

  private void test(){
        String mStr = "123";
        new Long(mStr);
        long l = new Long(mStr);
      System.out.println(Long.parseLong(mStr));
  }
    
}
