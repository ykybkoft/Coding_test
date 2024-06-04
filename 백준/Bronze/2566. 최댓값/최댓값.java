import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        String[][] arr = new String[9][9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max =0;
        int n1 = 0;
        int n2 =0;

        for (int i = 0; i <9 ; i++) {
            arr[i] = br.readLine().split(" ");
        }

        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {
                if(Integer.parseInt(arr[i][j])>max ){
                    max=Integer.parseInt(arr[i][j]) ;
                    n1 = i;
                    n2= j;

                }
            }

        }

        bw.write(max+"\n"+(n1+1)+" "+(n2+1));
        bw.flush();
        bw.close();
    }
}
