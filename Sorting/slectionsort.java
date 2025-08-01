package Sorting;
public class slectionsort {
    public static void main(String[] args) {
        int[] arr = {10,20,1,5,-3,12};
        
    for (int turn=0;turn<arr.length;turn++){
        int mini = turn;
        for(int j = turn+1; j<arr.length;j++){
            
                if(arr[j]<arr[mini]){
                    mini =j;
                }
            }
            int temp = arr[turn];
            arr[turn]= arr[mini];
            arr[mini] = temp;
    }   
        
        for(int k=0;k<arr.length;k++){
            System.out.print(" "+ arr[k]);
        }
    }
}
