import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String fmt ="[\uAC00-\uD7A30-9a-zA-Z]";
        while(true){
            str=br.readLine();
            if(str.equals(".")){
                break;
            }

            str=str.replaceAll(fmt,"");
            str=str.replaceAll(" ","");


            LinkedList<Character> list = new LinkedList<>();
            for (char c : str.toCharArray()) {


                if(c=='.' ){
                    if(list.size()==0){
                        System.out.println("yes");
                    
                    }else{
                        System.out.println("no");
                    }
                    break;
                }

                if(c=='[' || c=='(' ){
                    list.add(c);
                    //System.out.println(list);
                }else if(c==']'){
                    char d = list.peekLast()==null ? 'c' : list.pollLast();
                    //System.out.println(list);
                    if(d!='['){
                        System.out.println("no");
                        break;
                    }
                }else if (c==')'){
                    char d = list.peekLast()==null ? 'c' : list.pollLast();
                    //System.out.println(list);
                    if(d!='('){
                        System.out.println("no");
                        break;
                    }
                }
            }




        }




























    }
}