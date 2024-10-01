import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[end + 1];

        prime[0] = prime[1] =true;
        for (int i = 2; i*i <= end ; i++) {
            if(!prime[i]) {
                for (int j = i*i; j <= end; j+=i) {
                    prime[j] = true;
                }
            }
        }

        int hap = 0;
        int min =0;

        for(int i = start; i <= end; i++) {
            if(!prime[i]) {
                min = min == 0 ? i : min;
                hap+=i;
            }
        }
        
        if(min==0){
            System.out.println(-1);
            return;
        }

        System.out.printf("%d\n%d", hap, min);


        



    }
}
