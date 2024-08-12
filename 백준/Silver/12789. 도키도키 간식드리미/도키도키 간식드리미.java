
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int start = 1;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i <cnt ; i++) {
            int n = scan.nextInt();
            if(start == n ){
                start++;
                while(list.size()>0 &&start==list.getLast() ){
                    list.pollLast();
                    start++;
                }
            } else if (list.size() > 0 && list.getLast()==start) {
                list.pollLast();
                start++;
                while(list.size()>0 &&start==list.getLast() ){
                    list.pollLast();
                    start++;
                }

                if(n==start){
                    start++;
                }else{
                    list.add(n);
                }
            }else{
                list.add(n);
            }
            


        }



        System.out.println(list.size()==0 ? "Nice":"Sad");


























    }
}