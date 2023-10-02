import java.util.Scanner;
public class cross
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.printf("Sum:%d%n",x+y);
        System.out.printf("Difference:%d%n",x-y);
        System.out.printf("Product:%d%n",x*y);
        System.out.printf("Quotient:%d%n",x/y);
        System.out.printf("Remainder:%d%n",x%y);
        
    }
}