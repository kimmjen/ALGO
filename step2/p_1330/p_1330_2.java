package step2.p_1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1330_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();
            String[] split = input.split(" ");

            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            if (a > b) {
                System.out.println(">");
            } else if (a == b) {
                System.out.println("==");
            } else {
                System.out.println("<");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
