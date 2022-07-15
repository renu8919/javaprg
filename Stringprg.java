import java.util.Scanner;
import java.lang. String;
	class Main
	{
		public static void main(String[] args)
		{
			
			int v=0,c=0,i=0;
			Scanner input = new Scanner(System.in);

			System.out.println("Enter String:");
			String[] str= input.nextline();

			for(i=0;i<str.length();i++)
			{
				char ch= str.charAt(i);
				if(str[i]== 'a'||str[i]== 'e'||str[i]=='o'||str[i]=='i'||str[i]=='u')
				v++;
				else
				c++;
			}


			System.out.println("Vowels"+v);
			System.out.println("constant"+c);
		}
}		
