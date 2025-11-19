import java.util.*;

public class Main {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) ->
                Integer.compare(b[0], a[0])); // max-heap on distance
        for (int[] point : points) {
            int dist = point[0] * point[0] + point[1] * point[1];
            maxHeap.offer(new int[]{dist, point[0], point[1]});
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] entry = maxHeap.poll();
            result[i][0] = entry[1];
            result[i][1] = entry[2];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 2;
        int[][] answer = kClosest(points, k);
        System.out.println("The " + k + " closest points to the origin are:");
        for (int[] pt : answer) {
            System.out.println(Arrays.toString(pt));
        }
    }
}

