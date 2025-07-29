package patterns;
public class pat3 {
    public static void main(String[] args) {
        int row =1;
        int star=5;
        while(row<=5){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            star--;
            row++;
            System.out.println();
        }
    }
}
