import java.util.*;
public class logicalOperator { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("Ans is found : " + num);
        }
    }
}
