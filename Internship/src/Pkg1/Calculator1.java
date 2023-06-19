package Pkg1;

public class Calculator1 
{
	static void add(int a, int b)
	{
	
		int c=a+b;
		System.out.println(c);
	}
	void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args)
	{
		Calculator1.add(10, 5);
		Calculator1 c=new Calculator1();
		c.mul(6,2);
		

	}

}
