import java.util.*;
public class do_while_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        do {
            System.out.println(num);
            num++;
        }
        while(num <= 10);
    }
}
