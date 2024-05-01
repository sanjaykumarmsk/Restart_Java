import java.util.*;
public class conditionalPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (num % 2== 0 && num % 3 == 0) {
            System.out.println("Found Ans is : " + num);
        }
    }
}
