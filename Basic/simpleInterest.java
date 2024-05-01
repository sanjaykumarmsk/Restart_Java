import java.util.*;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value principle : ");
        int p = sc.nextInt();
        System.out.println("Enter the value rate : ");
        int r = sc.nextInt();
        System.out.println("Enter the value of time : ");
        int t = sc.nextInt();

        int SI = (p * r * t) / 100;
        System.out.println("Simple Interest (SI) is : " + SI ); 
    }
}
