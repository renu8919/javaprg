import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
			int n1,n2,n3,b;
			Scanner input= new Scanner(System.in);

			System.out.println("Enter First No:");
			n1=input.nextInt();
			

			System.out.println("Enter Second No:");
			n2=input.nextInt();
			

			System.out.println("Enter Third No:");
			n3=input.nextInt();

			b=(n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3;

			System.out.println("Biggest No:"+b);
		}
	}

