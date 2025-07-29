package Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        reverse(arr);
        print(arr);

    }// for range we have to put the valu from or to in i and j for full from 0 to arrays.length-1
    public static void reverse(int[] arr){
        int i=4;
        int j = 8;
        
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

        // to print array
    public static void print(int[] arr){
        int p=0;
        while(p<arr.length){
            System.out.print(arr[p]+" ");
            p++;
        }
    }  
    
}
