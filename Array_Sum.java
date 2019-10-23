/*created by sathish
To find array sum values
*/
import java.util.*;
public class Array_Sum {
    public static void main(String args[])
    {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements:"); //get input from user
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter element values:"); //get  element values from user
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i]; //calculate array of sum
        }
        System.out.println("The total sum is:" +sum); //print array sum values
    }
}
