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
public abstract class Meo implements Dong_Vat_Tren_Can{

    @Override
    public void move() {
        System.out.println("Run");
    }

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
    
}

abstract class tiger extends Meo{
	
}
