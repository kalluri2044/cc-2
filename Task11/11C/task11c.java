import java.util.*;

public class Main {
    public static int minCostTickets(int[] days, int[] costs) {
        int n = days.length;
        int lastDay = days[n - 1];
        Set<Integer> travelDays = new HashSet<>();
        for (int d : days) travelDays.add(d);
        int[] dp = new int[lastDay + 1];
        for (int i = 1; i <= lastDay; i++) {
            if (!travelDays.contains(i)) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.min(
                        dp[i - 1] + costs[0],
                        Math.min(
                                dp[Math.max(0, i - 7)] + costs[1],
                                dp[Math.max(0, i - 30)] + costs[2]
                        )
                );
            }
        }
        return dp[lastDay];
    }

    public static void main(String[] args) {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        System.out.println("The minimum cost for traveling on given days is: " + minCostTickets(days, costs)); // Output: 11
    }
}

