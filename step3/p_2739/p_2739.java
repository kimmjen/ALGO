package step3.p_2739;

import java.util.Scanner;

public class p_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
		for(int j = 1; j <=9; j++){
			System.out.println(N+" * "+ j+" = "+ N*j);
        }
    }
}
