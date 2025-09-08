/*Take a character input and check whether it is a vowel or consonant using switch. */
import java.util.Scanner;
public class logicalques9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch= sc.next().charAt(0);
        switch(Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Invalid input. Please enter an alphabetic character.");
                }
        }
    sc.close();
    }
}