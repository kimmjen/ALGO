package step2.p_14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_14681_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a > 0) {
            if(b > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        }
        if(a < 0) {
            if(b > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
        // if(a > 0 || b > 0) {
        //     System.out.println(1);
        // } else if (a < 0 || b > 0) {
        //     System.out.println(2);
        // } else if (a < 0 || b < 0) {
        //     System.out.println(3);
        // } else {
        //     System.out.println(4);
        // }
    }
    
}
