import java.util.Scanner;
public class triangle
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Invalid triangle");
        }
    }
}