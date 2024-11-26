import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(cards1));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList(cards2));

        for (String str : goal) {
            if (list1.size()!=0 && list1.getFirst().equals(str)) {
                list1.removeFirst();
                continue;
            }
            if(list2.size()!=0 && list2.getFirst().equals(str)) {
                list2.removeFirst();
                continue;
            }
            return "No";
        }

        return "Yes";
    }
}
