import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int i=1;

		Scanner input = new Scanner (System.in);

		for (i=1; i<=10; i++)
		table(i);

	}

	
	static void table(int x)
	{
		int i=0;

		for(i=1; i<=10; i++)
		System.out.printf("%d * %d = %d\n",x,i,(x*i));

	
	}
}

