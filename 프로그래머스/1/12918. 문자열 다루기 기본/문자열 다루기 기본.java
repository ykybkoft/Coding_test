class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if((s.length() == 4 || s.length()==6)){
            for (char c : s.toCharArray()) {
                if((int)c >= 48 && c <= 57){
                    
                }else{
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}