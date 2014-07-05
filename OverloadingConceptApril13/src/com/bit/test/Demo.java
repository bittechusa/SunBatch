package com.bit.test;

public class Demo {

	public static void main(String[] args)
	{
		Car c=new Car();
		System.out.println(c.kolim(12));
		c.move(10);
		
		
		Car b=new Bmw();
		b.move(19);
		
		
	
		

		Bmw bmw= new Bmw();
		bmw.move(2.2);
		
		System.out.println(bmw instanceof Car);
		
		
	
		

	}

}
