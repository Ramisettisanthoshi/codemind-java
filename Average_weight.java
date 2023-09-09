import java.util.Scanner;
public class hii{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int boy1weight=sc.nextInt();
        int boy2weight=sc.nextInt();
      int boy3weight=(3*X)-(boy1weight+boy2weight);
        System.out.println(boy3weight);
        sc.close();
        
    }
}