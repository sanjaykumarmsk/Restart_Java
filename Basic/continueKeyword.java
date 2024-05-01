import java.util.*;
public class continueKeyword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int num = 1; num <= n; num++) {
            if(num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}