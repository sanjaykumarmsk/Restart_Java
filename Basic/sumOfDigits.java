import java.util.*;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        while(n > 0) {
            sumOfDigits = sumOfDigits + n % 10;
            n = n / 10;
        }
        System.out.println("Sum of all digits is : " + sumOfDigits);
    }
}
