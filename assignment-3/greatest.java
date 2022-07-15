import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
			int x=0,i=0,g=0;

			Scanner input = new Scanner(System.in);
			
			for(i=1; i<=10; i++)
			{
			System.out.println("Enter Number:"+i);
			x = input.nextInt();
			
				if(i==1)
				g=x;
				else 
				if(x>g)
				g=x;
			}
			System.out.println("Greatest Number:"+g);
		}
	}
			
		


