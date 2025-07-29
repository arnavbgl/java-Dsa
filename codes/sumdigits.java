package codes;

import java.util.Scanner;

public class sumdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int sum=0;
    int num = sc.nextInt();
    while(num!=0){
        int rem = num%10;
        sum = sum+rem;
        num = num/10;
    } 
    System.out.println("Sum= " +sum);
    }
   
}
