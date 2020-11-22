package step7.p_1316;

import java.io.*;

public class p_1316_2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException {
 
		int count = 0;
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			if (check()) {
				count++;
			}
		}
		System.out.print(count);
	}
 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			
			if (prev != now) {		
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;	
				}
				else {
					return false;	
				}
			}
		}    
		return true;
	}
}