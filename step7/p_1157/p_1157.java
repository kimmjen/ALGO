package step7.p_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Arr = new int[26];
        String s= br.readLine();

        for(int i = 0; i < s.length(); i++) {
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                Arr[s.charAt(i) - 97]++;
            } else {
                Arr[s.charAt(i) - 65]++;
            }
        }
        int Max = 0;
        char ch = '?';
        for(int i = 0; i < 26; i++) {
            if(Arr[i] > Max) {
                Max = Arr[i];
                ch = (char)(i + 65);
            } else if(Arr[i] == Max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
    
}
