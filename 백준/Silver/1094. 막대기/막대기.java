

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String two = Integer.toBinaryString(num);

        int result = 0;

        for (int i = 0; i <two.length() ; i++) {
            if(two.charAt(i)=='1'){
                result++;
            }
        }

        System.out.println(result);























    }
}