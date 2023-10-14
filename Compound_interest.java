import java.util.*;
public class compound
{
    public static void main(String args[])
    {
        double P,R,T;
        double CI;
        Scanner sc=new Scanner(System.in);
        P=sc.nextDouble();
        R=sc.nextDouble();
        T=sc.nextDouble();
        CI=(float)P*(Math.pow((1+(R/100)),T));
        System.out.printf("%.2f",+CI);
    }
}