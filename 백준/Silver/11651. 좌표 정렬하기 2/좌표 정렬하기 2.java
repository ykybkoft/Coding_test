
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        String[] arr = new String[cnt];

        for (int i = 0; i <cnt ; i++) {
            arr[i] = br.readLine();
        }

        Comparator comp = new Comparator<String>( ) {

            public int compare(String o1, String o2) {

                return

                        Integer.parseInt( o1.split(" ")[1])
                        == Integer.parseInt(o2.split(" ")[1]) ? Integer.parseInt( o1.split(" ")[0]) -Integer.parseInt(o2.split(" ")[0]) :Integer.parseInt( o1.split(" ")[1]) -Integer.parseInt(o2.split(" ")[1]) ;
            }
        };

        Arrays.sort(arr,comp);

        for (int i = 0; i <cnt ; i++) {
            System.out.println(arr[i]);
        }





    }
}
