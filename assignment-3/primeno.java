import java.util.Scanner;
class Main
{
	public static void main(String...  args)
	{
		int x=0,p=0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = input.nextInt();
		p = prime(x);
		if(p==1)
		System.out.println("Number is Prime");
		else
		System.out.println("Number is not Prime");
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


