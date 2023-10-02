import java.util.Scanner;
public class area
{
    public static void main(String[] args)
    {
        int r;
        double area,perimeter;
        Scanner sc =new Scanner(System.in);
        r=sc.nextInt();
        area=(3.14)*(r*r);
        perimeter=2*(3.14)*(r);
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f ",perimeter);
    }
}