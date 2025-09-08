/*Take three numbers as input and find the largest using logical operators (&&). */
import java.util.Scanner;
public class logicalques6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for first number:");
        int a= sc.nextInt();
        System.out.println("Enter the value for second number:");
        int b= sc.nextInt(); 
        System.out.println("Enter the value for third number:");
        int c= sc.nextInt(); 
        if(a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if(b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    sc.close();
    }
}