package step1.p_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2588_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aNum = Integer.parseInt(br.readLine());
        int bNum = Integer.parseInt(br.readLine());
        
        for (char point : new StringBuffer(String.valueOf(bNum)).reverse().toString().toCharArray()) {
            System.out.println(aNum * Integer.parseInt(String.valueOf(point)));
        }
        System.out.println(aNum * bNum);
    }
    
}
