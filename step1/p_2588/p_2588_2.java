package step1.p_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2588_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
			int i=Integer.parseInt(br.readLine());
			int j=Integer.parseInt(br.readLine());
			System.out.println(i*(j%10));
			System.out.println(i*((j%100-j%10)/10));
			System.out.println(i*((j-j%100)/100));
			System.out.println(i*j);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
