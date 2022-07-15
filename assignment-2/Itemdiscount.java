import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
		int itemNo,itemQ;
		String itemName;
		double itemR=0.0;
		double itempr=0.0;
		double netPr=0.0;
		double ds=0.0;

		Scanner input= new Scanner(System.in);

		System.out.println("Enter Item Name:");
		itemName=input.nextLine();	
		
		System.out.println("Enter Item No:");
		itemNo=input.nextInt();

		System.out.println("Enter Item Rate:");
		itemR=input.nextDouble();

		System.out.println("Enter Item Quantity:");
		itemQ=input.nextInt();

		itempr=itemR*itemQ;

		if(itempr>1000 && itempr<2000)
		ds= 0.10*itempr;

		else
		if(itempr>2000 && itempr<3000)
		ds= 0.15*itempr;

		else
		if(itempr>3000 && itempr<5000)
		ds= 0.20*itempr;

		else
		if(itempr>5000)
		ds= 0.25*itempr;

		netPr= itempr-ds;
		
		System.out.println("Item No:"+itemNo);
		System.out.println("Item Name:"+itemName);
		System.out.println("Item Price:"+itempr);
		System.out.println("Item Discount:"+ds);
		System.out.println("Net Price:"+netPr);
	}
}
