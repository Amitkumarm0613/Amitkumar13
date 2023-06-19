package Pkg1;

public class Class1 
{
	static int add(int a, int b)   // static method
	{
		int c=a+b;
		return c;
	}
	double mul(double a, double b)   //Non static method
	{
		double c=a*b;
		return c;
	}

	public static void main(String[] args)
	{
		int res =Class1.add(10,5);
		System.out.println(res);   //15
		System.out.println(Class1.add(20,10));  //30
		
		Class1 c1=new Class1();
		double res1=c1.mul(5.0, 6.0);  //
		System.out.println(res1);  //30
		c1.mul(10,5);   //   50
		System.out.println(c1.mul(10, 5));
		//System.out.println(c1.mul(6.0, 2.0));  //12
		

	}

}
