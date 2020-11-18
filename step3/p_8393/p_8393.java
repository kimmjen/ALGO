package step3.p_8393;

import java.util.Scanner;

public class p_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Sum = 0;

        for(int i = 1; i <= N; i++) {
            Sum += i;
        }
        System.out.println(Sum);
    }
    
}
