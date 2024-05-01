import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num = 1, sum = 0;
        while(num <= n) {
            sum = sum + num;
            num++;
        }
        System.out.println("Sum is : " + sum);
    }
}