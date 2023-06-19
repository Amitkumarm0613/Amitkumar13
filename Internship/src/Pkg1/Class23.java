package Pkg1;

public class Class23 
{
	public void m1()
	{
		System.out.println("Method 1");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("method 2");
		this.m3();
	}
	public void m3()
	{
		System.out.println("Method 3" );
	}

	public static void main(String[] args) 
	{
		Class23 arg=new Class23();
		arg.m3();
		//arg.m2(24);
		//arg.m1();
	}
	

}
