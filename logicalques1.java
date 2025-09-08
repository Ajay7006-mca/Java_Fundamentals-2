/*Write a program to take a user’s name and age as input and print: "Hello , you are years
old." */
import java.util.Scanner;
public class logicalques1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        System.out.println("Hello "+name+", you are "+age+" years old.");
    sc.close();
    }
}