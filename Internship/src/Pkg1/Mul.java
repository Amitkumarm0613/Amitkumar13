package Pkg1;

public class Mul extends Sub1
{
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication="+c);
	}

	public static void main(String[] args) 
	{
		Mul m1=new Mul();
		m1.add();
		m1.sub();
		m1.mul();
		

	}

}
