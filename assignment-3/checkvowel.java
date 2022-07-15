import java.util.Scanner;
	class Main
	{
		public static void main(String[] args)
		{
		char ch;
		Scanner input=new Scanner (System.in);

		System.out.println("Enter character:");
		ch=input.net();

		Switch(ch)
		{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'u':
			case 'U':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			System.out.println(ch+"is Vowel");
			break;
			default:
			System.out.println(ch+"is Constant");
		}
		}

}
