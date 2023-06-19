package Pkg1;

public class Arithmatic
{
	public int sum(int a , int b)
	{
		int c;
		c=a+b;
		System.out.println("Sumresult is" + c);
		return c;
		
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Subresult is" +z);
		return z;
	}
	public void mul(int i, int j)
	{
		int k;
		k=i*j;
		System.out.println("Final result is " + k );
	}
	

	public static void main(String[] args) 
	{
		Arithmatic obj=new Arithmatic();
		int sumResult=obj.sum(10,2);
		int subResult=obj.sub(10,2);
		obj.mul(sumResult, subResult);
		
	}

}
