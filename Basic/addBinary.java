import java.util.*;

public class addBinary {
    static String addBinary(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second binary number:");
        String str2 = sc.nextLine();
        String sum = addBinary(str1, str2);
        System.out.println("Sum of binary numbers: " + sum);
    }
}
