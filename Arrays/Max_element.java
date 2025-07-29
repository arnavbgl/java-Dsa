
public class Max_element {
    public static void  main(String[] args) {
        int[] arr = {10,20,40,123,41,27};
        int max = arr[0];
        
         System.out.println("max element is" +" "+ findmax(arr,max));
       
    }
    public static int findmax(int[] brr, int maximum) {
        for (int i = 1; i < brr.length; i++) {
            if(maximum<brr[i]){
                maximum=brr[i];
            }
        }
        return maximum;
    }

}
