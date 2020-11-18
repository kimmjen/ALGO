package step3.p_2742;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p_2742_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
		
		N = Integer.parseInt(br.readLine().trim());
		
		for (int test_case = N; test_case >= 1; test_case --) {
			bw.write((test_case) + "\n");
		}
	    
		bw.flush();
		bw.close();
			
	}
}