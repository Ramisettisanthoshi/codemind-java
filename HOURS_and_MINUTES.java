import java.util.*;
public class hii
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int totalminute=sc.nextInt();
    int hours=totalminute/60;
    int minutes=totalminute%60;
    System.out.println(+hours+" Hour(s) "+ minutes+" Minute(s)");
    }
}