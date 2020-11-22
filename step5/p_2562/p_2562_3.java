package step5.p_2562;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p_2562_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.asList(
            sc.nextInt(), sc.nextInt(), sc.nextInt(),
            sc.nextInt(), sc.nextInt(), sc.nextInt(),
            sc.nextInt(), sc.nextInt(), sc.nextInt());

		sc.close();
 
		int value = Collections.max(list);
		int index = list.indexOf(value) + 1;
 
		System.out.println(value);
		System.out.println(index);
 
	}
}