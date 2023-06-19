package Pkg1;

public class Notebook
{
	double price=25.0;

	
	double getNoteBook(double amt)
	{
		System.out.println("Paid amount" +amt);
		amt=amt-price;
		return amt;
		
	}

	public static void main(String[] args)
	{
		Notebook n1=new Notebook();
		double change=n1.getNoteBook(30.0);
		System.out.println("received change"+change);
		//System.out.println();

	}

}
