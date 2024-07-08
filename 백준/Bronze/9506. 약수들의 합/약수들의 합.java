import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n==-1){
                break;
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);

            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if(n%i==0){
                    list.add(i);
                    if(i!=n/i){list.add(n/i);}
                }
            }
            Collections.sort(list);
            int hap =1;
            String result = n+" = 1";
            for (int i = 1; i < list.size() ; i++) {
                hap+=list.get(i);
                result+= " + "+list.get(i);

            }
            if(hap==n){
                bw.write(result+"\n");
            }else {
                bw.write(String.format("%d is NOT perfect.\n", n));
            }
        }

        bw.flush();

    }


}