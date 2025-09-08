import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for length of rectangle:");
        int l= sc.nextInt();
        System.out.println("Enter the value for breadth of rectangle:");
        int b= sc.nextInt(); 
        int perimeter= 2*(l+b);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    sc.close();
    }
}
