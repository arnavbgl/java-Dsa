package codes;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("hello");
       sum();
       System.out.println("hello");
    }
     static void sum(){
        Scanner num = new Scanner(System.in);
        int n1 = num.nextInt();
        int n2 = num.nextInt();
       System.out.println(n1+n2);
       }
    
}