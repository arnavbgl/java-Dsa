package codes;

public class swaping {
    public static void main(String[] args) {
        int[] array ={10,20,30,40,50};
        System.out.println(array[0]+" "+array[1]);
        swap(array,0,1);
        System.out.println(array[0]+" "+array[1]);
        

    }
    public static void swap(int[] arr,int i, int j) {
        int remp = arr[i];
         arr[i] =arr[j];
        arr[j] = remp;
    }
}
