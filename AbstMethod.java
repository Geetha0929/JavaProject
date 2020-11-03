package day5;

import pack2.AMthod;

public class AbstMethod extends AMthod implements DemoInterface{
	   public  void abs1() {
		   System.out.println("Abstract method1");
	   }
	   public void abs2() {
		   System.out.println("Abstract method2");
	   }
	   public void conc1() {
		   System.out.println("Concrete method3");
	   }

	   public void conc2() {
		   System.out.println("Concrete method4");
	   }
	public static void main(String[] args) {
		AbstMethod obj = new AbstMethod();
		obj.abs1();
		obj.abs2();
		obj.displ();
		obj.displ2();
		obj.conc1();
		obj.conc2();
           
		obj.I1();
		obj.I2();
		obj.I3();
		

	}
	@Override
	public void I1() {
		System.out.println("Interface1 ");		
	}
	@Override
	public void I2() {
		System.out.println("Interface2 ");		
		
	}
	@Override
	public void I3() {
		System.out.println("Interface3 ");		
		
	}

}
