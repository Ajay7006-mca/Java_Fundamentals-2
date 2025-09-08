/*Write a program to calculate the square and cube of a number using the * operator. */
import java.util.Scanner;
public class logicalques5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for number:");
        int num= sc.nextInt();
        int square= num * num;
        int cube= num * num * num;
        System.out.println("Square of the number is: "+square);
        System.out.println("Cube of the number is: "+cube);
    sc.close();
    }
}