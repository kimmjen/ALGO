package step2.p_2884;

import java.util.Scanner;

public class p_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int H = 0;
        int M = 0;
        
        if(b >= 45) {
            H = a;
            M = b - 45;
        } else {
            if(a > 0) {
                H = a - 1;
                M = 15 + b;
            } else {
                H = 23;
                M = 15 + b;
            }
        }
        System.out.println(H + " " + M);
    }
}

//         int H = sc.nextInt();
//         int M = sc.nextInt();

//         if (M < 45) {
//             H--;
//             M = 60 - (45 - M);
//             if (H < 0) {
//                 H = 23;
//             }
//             System.out.println(H + " " + M);
//         } else {
//             System.out.println(H + " " + (M - 45));
//         }
//     } 
// }
