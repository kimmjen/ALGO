package step1.p_10430;

import java.util.Scanner;

public class p_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // (A+B) % C
        System.out.println((a+b)%c);
        // ((A%C) + (B%C)) % C
        System.out.println(((a%c)+(b%c))%c);
        // (A*B) % C
        System.out.println((a*b)%c);
        // ((A%C) * (B%C)) % C
        System.out.println(((a%c)*(b%c))%c);
    }
    
}
