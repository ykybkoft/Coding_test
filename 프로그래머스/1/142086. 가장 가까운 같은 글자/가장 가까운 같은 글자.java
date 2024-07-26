import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(list.contains(str[i])){
                answer[i]=i-list.lastIndexOf(str[i]);
                list.add(str[i]);
            }else{
                answer[i]= -1;
                list.add(str[i]);
            }
        }
        
        return answer;
    }
}