import java.util.*;
public class maxOrMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a > b  &&  a > c) {
            System.out.println("max num is :" + a);
        } else if (b > a && b > c) {
            System.out.println("max num is : " + b);
        } else {
            System.out.println("max num is : " + c);
        }
    }
}
