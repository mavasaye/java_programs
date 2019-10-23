/*created by sathish
To find given strings are anagram or not
*/
import java.util.*;
public class CheckAnagram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:"); //get first string from user
        String first = sc.nextLine();
        System.out.println("Enter second string:"); //get second string from user
        String second = sc.nextLine();

        int firstLength = first.length(); //find length of first string
        int secondLength = second.length(); //find length of second string

        if (firstLength==secondLength) //check length of both string
        {
            //convert string into array
            char[] ch1 = first.toCharArray();
            char[] ch2 = second.toCharArray();

            //sort both array
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            //convert array into string
            first = Arrays.toString(ch1);
            second = Arrays.toString(ch2);

            if (first.equalsIgnoreCase(second))
            {
                System.out.println("String are anagram");
            }
            else
            {
                System.out.println("String are not anagram");

            }

        }
        else
        {
            System.out.println("String are not anagram");

        }


    }
}
