package Pkg1;

public class Overloading 
{
	void add(int x, int y)
	{
		int z=x+y;
		System.out.println("Add="+z);
	}
	void add(float x,float y)
	{
		double z=x+y;
		System.out.println("Add="+z);
	}

	public static void main(String[] args) 
	{
		Overloading ov=new Overloading();
		ov.add(2, 5);
		ov.add(1.3f,5);
			

	}

}
