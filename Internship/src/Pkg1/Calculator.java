package Pkg1;

public class Calculator 
{
	static int a=10; // static global
	static int b =5; // static global
	int x=10;        //  non static global 
	int y=15;        // non static global
	
	static void add()    // inside static method body only static global members are allowed
	{          
		int x=80;
		int y=35;
		System.out.println(x+y);
		System.out.println(a+b);
	}
    void mul()    // in non static method body both static and non static members are allowed
    {
    	int i=5;
    	int j=5;
    	System.out.println(i+j);
    	System.out.println(a+b);
    	System.out.println(x+y);
    }
	public static void main(String[] args)
	{
		Calculator.add();
		Calculator c1=new Calculator();
		c1.mul();
		

	}

}
