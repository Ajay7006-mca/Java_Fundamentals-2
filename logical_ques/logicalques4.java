/*Take two numbers as input and check which one is greater using the > operator. */
import java.util.Scanner;
public class logicalques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for first number:");
        int a= sc.nextInt();
        System.out.println("Enter the value for second number:");
        int b= sc.nextInt(); 
        if(a > b) {
            System.out.println(a + " is greater than " + b);
        } else if(b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    sc.close();
    }
}