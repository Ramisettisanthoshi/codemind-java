import java.util.*;
public class hii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalhandshakes=(n*(n-1))/2;
        System.out.println(totalhandshakes);
    }
}