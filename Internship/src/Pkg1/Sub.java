package Pkg1;

public class Sub extends Add    // Child cladss 
{
	void sub()
	{
		c=a-b;
	}
	void show()
	{
		System.out.println("Sub"+c);
	}

	public static void main(String[] args)
	{
		Sub s1=new Sub();
		s1.getData();   // parent 
		s1.add();      // parent
		s1.display();  // parent
		s1.sub();      // child class
		s1.show();     // child class
	}  

}
