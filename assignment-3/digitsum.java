import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
			int x=0,ds=0;

			Scanner input = new Scanner(System.in);
			System.out.println("Enter Digit:");

			x = input.nextInt();

			while(x!=0)
			{
				ds=ds+(x%10);
				x=x/10;
			}

			System.out.println("Sum of digit="+ds);
		}
	}
