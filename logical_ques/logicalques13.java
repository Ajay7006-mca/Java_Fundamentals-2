/* Take a number and print factorial using do-while.*/
import java.util.Scanner;
public class logicalques13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive integer to calculate its factorial:");
        int num= sc.nextInt();
        int factorial= 1;
        int i= 1;
        do {
            factorial *= i;
            i++;
        } while(i <= num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    sc.close();
    }
}