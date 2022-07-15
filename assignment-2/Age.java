import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
			int a=0;
			Scanner input = new Scanner(System.in);

			System.out.println("Enter Age:");
			a=input.nextInt();

			if(a<0)
			System.out.println("Invalid Age");

			else 
			 if(a>=18)
			 System.out.println("Major");

			 else
			 System.out.println("Minor");
		}
	}
