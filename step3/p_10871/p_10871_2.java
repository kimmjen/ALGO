package step3.p_10871;

import java.io.*;
import java.util.StringTokenizer;

public class p_10871_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int limit = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < count; i++) {
			String target = st.nextToken();
			
			if(Integer.parseInt(target) < limit){
				bw.write(target+" ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}