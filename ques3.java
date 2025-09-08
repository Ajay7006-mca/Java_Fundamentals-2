/*Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals).*/
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for base:");
        int base= sc.nextInt();
        System.out.println("Enter the value for exponent:");
        int exponent= sc.nextInt(); 
        double result= Math.pow(base, exponent);
        System.out.println("Result of base raised to the exponent is: "+result);
    sc.close();
    }
}
