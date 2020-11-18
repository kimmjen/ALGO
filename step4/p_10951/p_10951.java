package step4.p_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while((line = br.readLine()) != null) {
            String[] num = line.split(" ");
            System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));

        }
    }
    
}
