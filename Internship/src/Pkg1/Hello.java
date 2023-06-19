package Pkg1;

public class Hello 
{         // Boundry of the class 
	int a; // Variable
	  public void Amit()  // Indicate this is a method
	   {  // Boundry of Method
		System.out.println("Welcome  to all of you");
	   }
	

	public static void main(String[] args) 
	{
		Hello h1=new Hello();
		h1.Amit();
		h1.a=25;
		System.out.println(h1.a);
		h1.a=255;
		System.out.println(h1.a);
	}

}
