import java.util.*;
public class hii
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++)
        {
            String binary=sc.next();
            int decimal=Integer.parseInt(binary,2);
            String octal=Integer.toOctalString(decimal);
            System.out.println(octal);
        }
    }
}