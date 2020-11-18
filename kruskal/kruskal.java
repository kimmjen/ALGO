package kruskal;

import java.io.*;
import java.util.*;

public class kruskal {
    static int[] p;

    public static int find(int x) {
        if(x ==p [x]) return x;
        return find(p[x]);
    }
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x > y) p[x] = y;
        else p[y] = x;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cost = 0;
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        p = new int[n + 1];
        for(int i = 0; i < n; i++) p[i] = i;
        int[][] edge = new int[m][3];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                edge[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(edge, new Comparator<int[]>() {
            @Override
            public int compare(int[] cmp1, int[] cmp2) {
                if(cmp1[2] > cmp2[2]) return 1;
                else if(cmp1[2] < cmp2[2]) return -1;
                else return 0;
            }
        });
        for(int i = 0; i < edge.length; i++) {
            if(find(edge[i][0]) != find(edge[i][1])) {
                cost += edge[i][2];
                union(edge[i][0], edge[i][1]);
            }
        }
        System.out.println(cost);
    }
    
}
