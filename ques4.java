/*Write a program that takes three numbers as input from the user and prints
their average. */
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for first number:");
        int a= sc.nextInt();
        System.out.println("Enter the value for second number:");
        int b= sc.nextInt(); 
        System.out.println("Enter the value for third number:");
        int c= sc.nextInt(); 
        int average= (a+b+c)/3;
        System.out.println("Average of three numbers is: "+average);
    sc.close();
    }
}