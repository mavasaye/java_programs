/* created by sathish
To find a factorial value
 */
import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        int number, fact =1; //initialize & decelare value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:"); //Get input from user
        number = sc.nextInt();
        for (int i=1;i<=number;i++) //iterate loop still satisfies the condition
        {
            fact = fact*i;
        }
        System.out.println("The factorial value is:" +fact); //print the result

    }
}
