import java.util.*;
public class hii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int celcius=sc.nextInt();
        double fahrenheit=((celcius*9)/5.0)+32;
        System.out.printf("%.2f",fahrenheit);
}
}