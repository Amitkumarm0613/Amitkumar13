package Pkg1;

public class PosiNegaExample {

	public static void main(String[] args) 
	{
		int number=-18;
		if(number>0) // FALSE CONDITION
		{
			System.out.println("+ve");
		}
		else if(number<0)   // -18 COMPARE WITH ZERO // TRUE
		{
			System.out.println("-ve");   // O/P -VE
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
