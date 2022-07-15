import java.util.Scanner; 
	class Main
	{
		public static void main(String [] args)
		{
			final double PI=3.14;
			Scanner input = new Scanner(System.in);

			System.out.println("Enter Radius of Circle:");
			double r= input.nextDouble();
			double area= PI*r*r;
			System.out.println("Area of Circle:"+area);
		}
	}


