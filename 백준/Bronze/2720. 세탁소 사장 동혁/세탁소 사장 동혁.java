
import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] coin = {25,10,5,1};

        for (int i = 0; i <cnt ; i++) {
            int money = Integer.parseInt(br.readLine());
            int idx = 0;
            while(idx<coin.length){
                bw.write((money/coin[idx]==0?"0":money/coin[idx])+" ");
                money=money%coin[idx];
                idx++;
            }
            bw.write("\n");
        }




        bw.flush();
        bw.close();





























    }
}