package step3.p_10950;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p_10950_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> arr = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr.add(Integer.toString(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())));
        }

        for(int i = 0; i < count; i++) {
            bw.write(arr.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }


}