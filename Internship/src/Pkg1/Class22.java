package Pkg1;

public class Class22 
{
	public Class22()    // Default
	{
		System.out.println("Default constructor");
	}
	public Class22(int a) // One parameterized
	{
		System.out.println("One parameterized constructor");
	}
	public Class22(int a, int b)   //two parameterized
	{
		System.out.println("Two parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		Class22 ref=new Class22();
		Class22 ref1=new Class22(123);
		Class22 ref2=new Class22(123,21);
		

	}

}
