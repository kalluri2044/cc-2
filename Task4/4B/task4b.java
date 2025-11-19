import java.util.ArrayList;


class BagOfNumbers {
   private ArrayList<Integer> bag;


   public BagOfNumbers() {
       bag = new ArrayList<>();
   }


   public void add(int num) {
       bag.add(num);
   }


   public boolean remove(int num) {
       return bag.remove(Integer.valueOf(num));
   }


   public int size() {
       return bag.size();
   }


   public boolean isEmpty() {
       return bag.isEmpty();
   }


   public boolean contains(int num) {
       return bag.contains(num);
   }


   public void display() {
       System.out.println("Bag elements: " + bag);
   }


   public static void main(String[] args) {
       BagOfNumbers bag = new BagOfNumbers();
       bag.add(10);
       bag.add(20);
       bag.add(20);
       bag.add(30);


       bag.display();


       System.out.println("Removing 20: " + bag.remove(20));
       bag.display();


       System.out.println("Bag contains 30? " + bag.contains(30));
       System.out.println("Size of bag: " + bag.size());
       System.out.println("Is bag empty? " + bag.isEmpty());
   }
}
