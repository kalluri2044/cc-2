import java.util.Scanner;


class DiskTower {
   static void arrangeDisks(int[] disks, int n) {
       int max = n;
       boolean[] placed = new boolean[n + 1]; // to track which disks have arrived
       System.out.println("\nDisk Placement Process:");
       for (int i = 0; i < n; i++) {
           placed[disks[i]] = true;  // mark the disk as arrived
           System.out.print("Day " + (i + 1) + " -> ");
           while (max >= 1 && placed[max]) {
               System.out.print(max + " ");
               max--;
           }
           System.out.println();
       }
   }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of disks: ");
       int n = sc.nextInt();
       int[] disks = new int[n];


       System.out.println("Enter disk sizes (one per day):");
       for (int i = 0; i < n; i++) {
           disks[i] = sc.nextInt();
       }


       arrangeDisks(disks, n);
       sc.close();
   }
}
