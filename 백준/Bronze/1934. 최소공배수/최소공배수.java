import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());



        for (int i = 0; i < cnt ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            int small = Math.min(n1, n2);
            int big = Math.max(n1, n2);

            while (big > 0) {
                int tmp = big;
                big = small%big;
                small = tmp;
            }

            bw.write(n1*n2/small + "\n");
        }

        bw.flush();



        



    }
}
