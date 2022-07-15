import java.util.Scanner;
class Area
{
        public static void main(String...a)
        {
                int l;
                int b;
                int ar;
                Scanner input= new Scanner(System.in);
                System.out.printf("Enter length:");
                l=input.nextInt();
                System.out.printf("Enter Breath:");
                b=input.nextInt();
                ar= l*b;
                System.out.printf("Area=%d",ar);
        }
}



