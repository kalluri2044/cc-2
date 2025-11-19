public class Main {
    public static int numWaterBottles(int numBottles, int exchangeRate) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= exchangeRate) {
            int newFull = emptyBottles / exchangeRate;
            totalDrunk += newFull;
            emptyBottles = emptyBottles % exchangeRate + newFull;
        }
        return totalDrunk;
    }

    public static void main(String[] args) {
        int numBottles = 9, exchangeRate = 3;
        System.out.println("Maximum number of bottles that can be drunk: " + numWaterBottles(numBottles, exchangeRate)); // Output: 13
    }
}

