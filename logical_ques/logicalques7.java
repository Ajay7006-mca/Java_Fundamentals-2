/*Take marks as input and print the grade using if-else: (90+ → A, 75–89 → B, 50–74 → C,
below 50 → Fail). */
import java.util.Scanner;
public class logicalques7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks= sc.nextInt();
        if(marks >= 90) {
            System.out.println("Grade A");
        } else if(marks >= 75) {
            System.out.println("Grade B");
        } else if(marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    sc.close();
    }
}