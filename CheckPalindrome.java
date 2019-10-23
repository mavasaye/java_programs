/*created by sathish
To find given string/number is palindrome or not
*/
import java.util.*;
class CheckPalindrome //class name
{
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);// Objects of String class
        System.out.println("Enter a string/number:");
        original = in.nextLine();
        int length = original.length(); // Find a string length
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
