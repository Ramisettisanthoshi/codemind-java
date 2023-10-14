
import java.util.*;
public class GFG {
	public static void main(String args[])
	{
		int P , R , T;
		Scanner sc=new Scanner(System.in);
		P=sc.nextInt();
		R=sc.nextInt();
		T=sc.nextInt();
		
		int SI = (P * T * R) / 100;
		System.out.printf("%d",+ SI);
	}
}
