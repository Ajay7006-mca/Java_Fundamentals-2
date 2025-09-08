/*Take a string input and print characters one by one, but stop when a space is found. */
import java.util.Scanner;
public class logicalques18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String input= sc.nextLine();
        System.out.println("Characters in the string until a space is found:");
        for(int i= 0; i < input.length(); i++) {
            char ch= input.charAt(i);
            if(ch == ' ') {
                break;
            }
            System.out.println(ch);
        }
    sc.close();
    }
}