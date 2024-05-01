import java.util.*;
public class countNumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int numOfDigits = 0;
        while(n > 0) {
            n = n / 10;
            numOfDigits++;
        }
        System.out.println("Number of digit in "+" = " + numOfDigits );
    }
}
