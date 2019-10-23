/* created by sathish
Find the fibanocci series */
import java.util.*;
public class FibanocciSeries {
    public static void main(String args[])
    {
        int n1,n2,n3,terms; //declare a variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:"); //get input from user
        terms = sc.nextInt();
        n1=0;n2=1; //initialize variable
        System.out.print(n1+ " "+n2);
        for (int i=2;i<=terms;i++) //iterate the loop still check equal of terms value
        {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2; //swap value
            n2=n3;
        }
    }
}
