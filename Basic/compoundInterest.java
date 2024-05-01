import java.util.*;
public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p : ");
        double p = sc.nextDouble();
        System.out.println("Enter the value of r : ");
        double r = sc.nextDouble();
        System.out.println("Enyer the value of t : ");
        double t = sc.nextDouble();
        double CI = p * (Math.pow((1 + r / 100), t));

        System.out.println("Compound Interest (CI) : " + CI);
    }
}
