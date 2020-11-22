package step7.p_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Arr = new int[26];

        for(int i = 0; i < Arr.length; i++) {
            Arr[i] = -1;
        }

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Arr[ch - 'a'] == -1) {
                Arr[ch - 'a'] = i;
            }
        }

        for(int val : Arr) {
            System.out.print(val + " ");
        }
    }
    
}
