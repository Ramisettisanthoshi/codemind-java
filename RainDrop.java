import java.util.*;
public class hii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String result="";
        if(number%3==0)
        {
            result+="Pling";
        
        }
        if(number%5==0)
        {
            result+="Plang";
        }
        if(number%7==0)
        {
            result+="Plong";
        }
        if(result.isEmpty())
        {
            result=Integer.toString(number);
        }
        System.out.println(result);
    }
}