package step1.p_2588;

import java.io.IOException;
import java.util.Scanner;

public class p_2588_4 {
    public static void main(String[] args) throws IOException {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println(a*(b%10));
        System.out.println(a*(b/10%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
    
}
