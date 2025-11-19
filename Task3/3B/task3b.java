import java.util.Scanner;
public class Chaitanya {
   public static boolean isPalindrome(String input) {
       int left = 0;
       int right = input.length() - 1;
       while (left < right) {
           if (input.charAt(left) != input.charAt(right)) {
               return false;
           }
           left++;
           right--;}
       return true;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string or number: ");
       String input = sc.nextLine();
       if (isPalindrome(input)) {
           System.out.println(input + " is a palindrome.");
       } else {
           System.out.println(input + " is NOT a palindrome.");
       }
       sc.close();
   }
}
