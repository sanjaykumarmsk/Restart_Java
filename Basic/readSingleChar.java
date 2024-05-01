import java.util.*;
public class readSingleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        //read single character
        char ch = sc.next().charAt(5);
        System.out.println("Character is : " + ch);    
    }    
}