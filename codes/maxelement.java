package codes;

public class maxelement {
    public static void main(String[] args) {
        int[] array = {2,3,51,4,2,45,61,1};
        int max =0;
        System.out.println(maxele(array,max));
    }
    public static int maxele(int[] arr , int max){
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
