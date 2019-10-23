/*created by sathish
To print duplicate elements from given array
*/
import java.util.*;
public class Check_Duplicate {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements:"); //get input from user
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements values:"); //enter element values
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
            for (int i=0;i<a.length;i++)
            {
               for (int j=i+1;j<a.length;j++)
               {
                   if (a[i]==a[j])
                   {
                       System.out.println("The duplicate element values are:" +a[j]); //print duplicate element values
                   }

               }
            }


    }
}
