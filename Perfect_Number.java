import java.util.*;
public class perfect
{
    public static void main(String args[])
    {
        int num,sum=0,i,rem;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    for(i = 1; i < num; i++)  
     {  
       rem = num % i;  
       if (rem == 0) {  
            sum = sum + i;  
          }  
     }  
if (sum == num)  
        System.out.println("True");  
           else  
    System.out.println("False");
    
    }
}