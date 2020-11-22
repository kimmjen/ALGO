package step5.p_1546;

import java.util.Arrays;
import java.util.Scanner;

public class p_1546_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Arr[] = new double[sc.nextInt()];

        for(int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextDouble();
        }
        sc.close();

        double Sum = 0;
        Arrays.sort(Arr);

        for(int i = 0; i < Arr.length; i++) {
            Sum += ( (Arr[i] / Arr[Arr.length-1]) * 100 );
        }
        System.out.println( Sum / Arr.length );
    }
    
}
