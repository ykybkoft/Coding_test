
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cnt_arr = br.readLine().split(" ");

        int cnt1 = Integer.parseInt(cnt_arr[0]);
        int cnt2 = Integer.parseInt(cnt_arr[1]);

        HashMap<String,Integer> map = new HashMap<>();
        String[] arr = new String[cnt1];

        for (int i = 0; i <cnt1 ; i++) {
            String store = br.readLine();
            map.put(store,i+1);
            arr[i] = store;

        }

        for (int i = 0; i <cnt2 ; i++) {
            String target = br.readLine();
            if((int)target.charAt(0) <=57){
                bw.write(arr[Integer.parseInt(target)-1]+"\n");
            }else{
                bw.write(map.get(target)+"\n");
            }
        }


        bw.flush();



























    }
}