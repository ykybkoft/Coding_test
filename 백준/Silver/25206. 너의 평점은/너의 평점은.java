
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        HashMap<Character,Double> map = new HashMap<>();

        map.put('A',4.0);
        map.put('B',3.0);
        map.put('C',2.0);
        map.put('D',1.0);
        map.put('F',0.0);
        map.put('+',0.5);
        map.put('0',0.0);


        double cnt=0.0;
        double result = 0.0;

        
        for (int i = 0; i <20; i++) {

            String[] arr = br.readLine().split(" ");
            if(arr[2].charAt(0)!='P'){
              result+= Double.parseDouble(arr[1])*(map.get(arr[2].charAt(0))+(arr[2].length()==1 ? 0.0 : map.get(arr[2].charAt(1))));
              cnt+=Double.parseDouble(arr[1]);
            }


        }

        System.out.println(Math.round(result/cnt*1000000)/1000000.0);






















    }
}