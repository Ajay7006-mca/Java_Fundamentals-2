/*Print the sum of digits of a given number using while. */
import java.util.Scanner;
public class logicalques12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer to calculate the sum of its digits:");
        int num= sc.nextInt();
        int sum=0;
        while(num != 0) {
            int digit= num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of the digits is: " + sum);
    sc.close();
    }
}