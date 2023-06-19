package Pkg1;

public class Demo 
{
	int x=20;   // non static global variables
	int y=0;   //  non static global variables // Instance variables

	public static void main(String[] args) 
	{
		
		Demo d1=new Demo();
		System.out.println(d1.x);
		System.out.println(d1.y);

	}

}
