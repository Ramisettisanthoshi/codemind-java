import java.util.*;
public class hii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        String[] timeParts=time.split(":");
        int hours=Integer.parseInt(timeParts[0]);
        int minutes=Integer.parseInt(timeParts[1]);
        double hourAngle=(hours%12+minutes/60.0)*30;
        
        double minuteAngle=minutes*6;
        double angleDiff=Math.abs(hourAngle-minuteAngle);
        double minAngle=Math.min(angleDiff,360-angleDiff);
        System.out.println(minAngle);
        sc.close();
    }
}