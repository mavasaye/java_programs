/*created by sathish
To find given number is armstrong or not
*/
import java.util.*;
public class CheckArmstrong {
    public static void main(String args[])
    {
        int number,sum=0,temp,remainder;
        System.out.println("Enter a number:"); //Input from user
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        temp = number; //assign number into temp
        while(number>0)
        {
            remainder = number%10; //find remainder value
            sum = sum+(remainder*remainder*remainder); //calculate sum values
            number = number/10;
        }
        if (temp==sum) //check temp & sum values are equal
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");

        }
    }
}
