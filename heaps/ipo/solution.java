import java.util.*;

class Solution {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = capital.length;
        int[][] projects = new int[n][2];

        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> profit = new PriorityQueue<>((a,b)->b-a);

        int i = 0;

        while (k > 0) {

            while (i < n && projects[i][0] <= w) {
                profit.add(projects[i][1]);
                i++;
            }

            if (profit.isEmpty()) {
                break;
            }

            w += profit.poll();
            k--;
        }

        return w;
    }
    public static void main(String[] args ){
       int k = 2, w = 0;
     int[] profits = {1, 2, 3};
     int[] capital = {0, 1, 1};
       int result=findMaximizedCapital(k,w,profits,capital);
       System.out.println(result);
    }
}