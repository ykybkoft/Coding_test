
import java.io.*;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i <cnt ; i++) {
            String str = br.readLine();
            switch (str.split(" ")[0]){
                case "push":
                    list.add(str.split(" ")[1]);
                    break;
                case "pop":
                    bw.write((list.isEmpty()?"-1":list.pollFirst())+"\n");
                    break;
                case "size":
                    bw.write(list.size()+"\n");
                    break;

                case "empty":
                    bw.write(list.isEmpty()?"1\n":"0\n");
                    break;
                case "front":
                    bw.write((list.isEmpty()?"-1":list.peekFirst())+"\n");
                    break;
                case "back":
                    bw.write((list.isEmpty()?"-1":list.peekLast())+"\n");
                    break;
            }
        }

        bw.flush();
        bw.close();





























    }
}