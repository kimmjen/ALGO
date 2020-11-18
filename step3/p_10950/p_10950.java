package step3.p_10950;

import java.util.Scanner;

public class p_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] sumAry = new int[N];

        for(int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] intAry = line.split(" ");

            sumAry[i] = Integer.parseInt(intAry[0]) + Integer.parseInt(intAry[1]);
        }
        for(int i = 0; i < N; i++) {
            System.out.println(sumAry[i]);
        }

    }
    
}
