/*Write a program that takes two numbers as input from the user and prints
their sum. */
import java.util.Scanner;
public class ques7 {    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for first number:");
        int a= sc.nextInt();
        System.out.println("Enter the value for second number:");
        int b= sc.nextInt(); 
        int sum= a+b;
        System.out.println("Sum of two numbers is: "+sum);
    sc.close();
    }
}