class Solution {
    public int solution(int a, int b) {
         int answer = 0;
        String tmp = "";
        tmp += a;
        tmp += b;
        answer = a*b*2 > Integer.parseInt(tmp) ? a*b*2 : Integer.parseInt(tmp); 
        return answer;
    }
}