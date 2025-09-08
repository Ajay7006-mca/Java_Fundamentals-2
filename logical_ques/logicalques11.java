/*Print the multiplication table of a given number using for. */
import java.util.Scanner;
public class logicalques11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer to print its multiplication table:");
        int num= sc.nextInt();
        System.out.println("Multiplication table of " + num + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    sc.close();
    }
}