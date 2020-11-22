package step5.p_2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Arr = new int[9];

        for(int i = 0; i < 9; i++) {
            Arr[i] = Integer.parseInt(br.readLine());
        }
        int Max = 0;
        int index = 0;
        int count = 0;

        for(int value : Arr) {
            count++;
            if(value > Max) {
                Max = value;
                index = count;
            }
        }
        System.out.println(Max);
        System.out.println(index);
    }
    
}
