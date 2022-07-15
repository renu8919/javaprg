import java.util.Scanner;
	class Main
	{
		public static void main(String...args)
		{
			int x=0,i=0,sumE=0,sumO=0;

			for(i=1;i<=100;i++)
			{
				x=i;
				if(x%2==0)
				{
				System.out.printf("Even:%d ",x);
				sumE = sumE + x;
				}
				else
				{
				System.out.printf("Odd:%d ",x);
				sumO = sumO + x;
				}

			}

			System.out.println("Sum of Even No:"+sumE);
			System.out.println("Sum of Odd No:"+sumO);
		}
	}
