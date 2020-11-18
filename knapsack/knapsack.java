package knapsack;

import java.util.*;

public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] w = new int[n];
        int[] v = new int[n];

        int[][] dp = new int[n+1][k+1];
        int max = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= k; j++) {
                if(w[i-1] <= j)
                    dp[i][j] = Math.max(v[i-1] + dp[i-1][j-w[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
                max = Math.max(dp[i][j], max);
            }
        }
        System.out.println(max);
    }
    
}
