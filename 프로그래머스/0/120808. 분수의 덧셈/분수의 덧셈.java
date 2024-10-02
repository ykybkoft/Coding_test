class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerp = (numer1 * denom2) + (numer2 * denom1); 
        int denomp = denom1 * denom2;
        
        
            for(int i = denomp ; i>=1 ; i--) {
                if(numerp % i == 0 && denomp % i == 0) { 
                    numerp = numerp/i;
                    denomp = denomp/i;
                } 
                
            }
        
        
        
        
        
        int[] answer = {numerp, denomp};
        return answer;
    }
}