import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int idx = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0){
                list.add(i);
                if(i!=n/i){list.add(n/i);}
            }
        }

        Collections.sort(list);
        
        System.out.println((list.size()<idx)?0:list.get(idx-1));
    }


}