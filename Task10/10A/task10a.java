import java.util.*;

public class Main {
    public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }
        while (!minHeap.isEmpty() && result.size() < k) {
            int[] curr = minHeap.poll();
            int i = curr[1], j = curr[2];
            result.add(new int[]{nums1[i], nums2[j]});
            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<int[]> pairs = kSmallestPairs(nums1, nums2, k);
        System.out.println("The " + k + " pairs with the smallest sums are:");
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
