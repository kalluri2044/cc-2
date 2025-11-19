import java.util.Scanner;
public class Chaitanya {
   public static boolean isValidPassword(String password) {
       if (password.length() < 8) return false;
       boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
       for (char ch : password.toCharArray()) {
           if (Character.isUpperCase(ch)) hasUpper = true;
           else if (Character.isLowerCase(ch)) hasLower = true;
           else if (Character.isDigit(ch)) hasDigit = true;
           else if ("@#!$%^&*()-_+=<>?/|\\{}[]~".indexOf(ch) != -1) hasSpecial = true;
       }
       return hasUpper && hasLower && hasDigit && hasSpecial;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a password to validate: ");
       String password = sc.nextLine();
       if (isValidPassword(password)) {
           System.out.println("Password is valid.");
       } else {
           System.out.println("Password is invalid. It must be at least 8 characters long and include uppercase, lowercase, digit, and special character.");
       }
       sc.close();
   }}
