package step5.p_10818;

import java.util.Arrays;
import java.util.Scanner;

public class p_10818_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
        
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}
}