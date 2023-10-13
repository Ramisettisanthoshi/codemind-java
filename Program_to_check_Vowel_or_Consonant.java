import java.util.Scanner;
public class VowelOrConsonant {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      char C= sc.next().charAt(0);
      if(C== 'a'|| C== 'e'|| C== 'i' ||C== 'o' ||C== 'u'||C=='A'||C=='E'||C=='I'||C=='O'||C=='U'){
         System.out.println("Vowel");
      }else{
         System.out.println("Consonant");
      }
   }
}