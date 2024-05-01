import java.util.Scanner;
public class breakKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        while(true) {
            if ((num % 5 == 0) && (num % 7 == 0)){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
