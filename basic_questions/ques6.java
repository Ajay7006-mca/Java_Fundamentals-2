/*Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. */
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for Principal:");
        double principal= sc.nextDouble();
        System.out.println("Enter the value for Rate:");
        double rate= sc.nextDouble(); 
        System.out.println("Enter the value for Time:");
        double time= sc.nextDouble(); 
        double simpleInterest= (principal * rate * time)/100;
        System.out.println("Simple Interest is: "+simpleInterest);
    sc.close();
    }
}