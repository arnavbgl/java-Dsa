

public class Minimumindex {
    public static void main(String[] args) {
        int[] arr = {10,20,1,5,-3,12};
        int mini = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<arr[mini]){
                mini=i;
            }
        }
        System.out.println("min index " + mini);
    }
}
