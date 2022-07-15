import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
			int i=0,sum=0;

			Scanner input = new Scanner(System.in);

			System.out.println("--------------------------");
			System.out.println("Number           Factorial");
			System.out.println("--------------------------");

			for(i=1; i<=5; i++)
			{
				System.out.println(i+"              "+fact(i));
				sum=sum+fact(i);

			}
			System.out.println("Sum="+sum);
		}


		static int fact(int x)
		{
			int f=1,i=1;
			while(i<=x)
			{
				f=f*i;
				i++;
			}
		return f;
		}
	}
