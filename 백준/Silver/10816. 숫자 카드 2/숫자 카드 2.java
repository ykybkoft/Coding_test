
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt1 = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i <cnt1 ; i++) {
            if(map.containsKey(arr[i])){
                map.replace(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        cnt1= Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");

        for (int i = 0; i <cnt1 ; i++) {
            if(map.containsKey(arr[i])){
                bw.write(map.get(arr[i])+" ");
            }else{
                bw.write("0 ");
            }
        }

        bw.flush();
























    }
}
