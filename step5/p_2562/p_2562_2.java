package step5.p_2562;

import java.util.Scanner;

public class p_2562_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Arr = {
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
        };
        sc.close();
        int count = 0;
        int Max = 0;
        int index = 0;

        for(int value : Arr) {
            count++;
            if(value > Max) {
                Max = value;
                index = count;
            }
        }
        System.out.println(Max + "\n" + index);
    }
    
}
