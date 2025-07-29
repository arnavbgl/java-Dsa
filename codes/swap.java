package codes;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       int num1 = num.nextInt();
       int num2 = num.nextInt();
       swap( num1 , num2); 
       System.out.println(num1);
       System.out.println(num2);
    }
    static void swap( int a, int b){
        int temp = a;
         a = b;
         b = temp;
         
    }
}