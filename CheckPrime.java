/*created by sathish
To find given number is prime or not
*/
import java.util.*;
public class CheckPrime //class name
{
    public static void main(String[] args) {
        int number, i, count = 0;
        Scanner scan = new Scanner(System.in); //object create
        System.out.println("Enter a number:");
        number = scan.nextInt();
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This isn't a prime number");
        }
    }
}
