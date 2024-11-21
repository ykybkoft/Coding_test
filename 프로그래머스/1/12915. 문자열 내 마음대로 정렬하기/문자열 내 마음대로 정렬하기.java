import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        answer = Arrays.stream(strings).sorted().sorted(Comparator.comparing(
                s -> s.charAt(n)
        )).toArray(String[]::new);
        
        return answer;
    }
}