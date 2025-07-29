package codes;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }System.out.println("Array is");
        for(int i=0;i<n;i++){
            
            System.out.print(array[i] + " ");
            
                       
        } System.out.println("Reverse Array is");

        for(int i=n-1;i>=0;i--){
            System.out.print(array[i] + " ");
        }
    }
}
