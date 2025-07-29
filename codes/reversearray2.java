package codes;

public class reversearray2{
    public static void main(String[] args) {
        int[] arr ={10,12,14,15,16};
        int i=0;
        int j=arr.length-1;
       
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
         int p=0;
        while(p<=arr.length-1){
        System.out.println(arr[p]);
        p++;}
    }
}