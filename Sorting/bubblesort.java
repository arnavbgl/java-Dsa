package Sorting;
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];
    for (int idx = 0; idx < arr.length; idx++) {
        arr[idx] = input.nextInt();
        
    }
    for(int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for (int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");}
}
    }

