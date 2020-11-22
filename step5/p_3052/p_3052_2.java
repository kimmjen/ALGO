package step5.p_3052;

import java.util.*;

public class p_3052_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            h.add(sc.nextInt());
            // 입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }
        sc.close();
        System.out.println(h.size());
    }
    
}
