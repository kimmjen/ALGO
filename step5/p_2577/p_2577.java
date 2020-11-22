package step5.p_2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Arr = new int[10];

        int value = Integer.parseInt(br.readLine())
        * Integer.parseInt(br.readLine())
        * Integer.parseInt(br.readLine());

        String str = String.valueOf(value);

        for(int i = 0; i < str.length(); i++) {
            Arr[(str.charAt(i) - 48)]++;
        }

        for(int v : Arr) {
            System.out.println(v);
        }
    }
    
}
