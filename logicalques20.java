/*Take 10 numbers in an array and print the second largest element. */
import java.util.Scanner;
public class logicalques20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numbers= new int[10];
        System.out.println("Enter 10 integers:");
        for(int i= 0; i < 10; i++) {
            numbers[i]= sc.nextInt();
        }
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for(int num : numbers) {
            if(num > largest) {
                secondLargest= largest;
                largest= num;
            } else if(num > secondLargest && num != largest) {
                secondLargest= num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
        sc.close();
    }
}