package step3.p_10950;

import java.util.Scanner;

public class p_10950_3 {
    static int T, A, B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int t = 1; t<=T; t++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
