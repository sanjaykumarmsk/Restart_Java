import java.util.*;
public class square { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println("a raise to the power b is : " + ans);    
    }
}
