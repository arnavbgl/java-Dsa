package  codes;
import java.util.Scanner;
public class Linersearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name");
        String strname =  sc.nextLine();
        System.out.println("Enter the searching target");
        char target =  sc.next().charAt(0);
        System.out.println(search(strname, target));
    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}