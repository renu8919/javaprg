import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
			String itemName;
			int itemNo;
			double itemR;
			int itemQ;
			double pr;

			Scanner input= new Scanner(System.in);

			System.out.println("Enter Item Name:");
			itemName= input.nextLine();

			
			System.out.println("Enter Item Number:");
			itemNo= input.nextInt();

			
			System.out.println("Enter Item Item Rate:");
			itemR= input.nextDouble();


			System.out.println("Enter Item Quantity:");
			itemQ= input.nextInt();

			pr= itemR*itemQ;


			System.out.println(" Item Name:"+itemName);
			
			System.out.println(" Item No:"+itemNo);
			
			System.out.println(" Item Price:"+pr);
		}
}





