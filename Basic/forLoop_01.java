import java.util.*;
public class forLoop_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int num = 0; num <= n; num++) {
            System.out.print(num + " ");
        }
    }
}
