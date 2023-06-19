package Pkg1;

public class Tinga extends Ringa
{
	void show3()
	{
		System.out.println("subclass Tinga");
	}

	public static void main(String[] args) 
	{
		Tinga t1= new Tinga();
		t1.show();
		t1.show3();
		Minga m1=new Minga();
		m1.show();
		m1.show2();

	}

}
