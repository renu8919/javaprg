import java.util.Scanner;
class Main
{
	public static void main(String...  args)
	{
		int sum=0,i=0;

		Scanner input = new Scanner(System.in);
		
		
		for(i=2; i<=100; i++)
		{
			if(prime(i)==1)
			{
			sum = sum + i;
		System.out.println("Number is Prime"+i);
			}
		else
		System.out.println("Number is not Prime"+i);
		}
		System.out.println("Sum of prime numbers:"+sum);
	}

	static int prime(int x)
	{
		int i=0;

		if (x==0||x==1)
		return 0;
		for(i=2; i<=x/2; i++)
		{
			if(x%i==0)
			return 0;
		}
		return 1;
	}
}


