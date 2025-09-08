/*Take two numbers as input and print their sum, difference, product, and quotient. */
import java.util.Scanner;
public class logicalques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for first number:");
        int a= sc.nextInt();
        System.out.println("Enter the value for second number:");
        int b= sc.nextInt(); 
        int sum= a+b;
        int difference= a-b;
        int product= a*b;
        double quotient= (double)a/b;
        System.out.println("Sum of two numbers is: "+sum);
        System.out.println("Difference of two numbers is: "+difference);
        System.out.println("Product of two numbers is: "+product);
        System.out.println("Quotient of two numbers is: "+quotient);
    sc.close();
    }
}