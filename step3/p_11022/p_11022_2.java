package step3.p_11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p_11022_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
       
       for(int i = 1; i<=T; i++) {
    	   String text = br.readLine();
    	   String[] word = text.split(" ");
    	   int A = Integer.parseInt(word[0]);
    	   int B = Integer.parseInt(word[1]);
    	   bw.write("Case #"+i+": "+ A + " + " + B + " = " + (A+B)+"\n");
       }
    bw.flush();
    bw.close();

    }
}
