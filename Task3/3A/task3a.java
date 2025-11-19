import java.util.Scanner;
public class Chaitanya {
   public static void printStarTriangle(int n) {
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of rows for the pattern: ");
       int rows = sc.nextInt();


       System.out.println("Star Triangle Pattern:");
       printStarTriangle(rows);
       sc.close();
   }
}
