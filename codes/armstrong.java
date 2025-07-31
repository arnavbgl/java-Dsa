
import java.util.Scanner;
public class armstrong{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int dep = num;
        System.out.println(check(num,dep));
        
    }
    public static int  count(int num){
        int count=0;
        while(num>0){
            num= num/10;
            count++; }
            return count;
   }
   public static boolean check(int num, int dep){
    int d = count(num);
    double sum=0;
    while(num>0){
        int rem =num%10;
        sum = sum + Math.pow(rem,d);
        num=num/10;
    }
    if(sum==dep){
        return true;
    }else{
        return false;
    }
   }
}