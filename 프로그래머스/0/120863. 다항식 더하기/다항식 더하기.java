class Solution {
   public String solution(String polynomial) {
        String answer = "";

        String[] arr = polynomial.split(" ");
        int n =0;
        int x =0;
        for (int i = 0; i < arr.length ; i+=2) {
            int tmp = arr[i].indexOf("x");

            if(tmp==-1){
                n+=Integer.parseInt(arr[i]);
            }else if (tmp ==0){
                x++;
            }else{
                x+=Integer.parseInt(arr[i].substring(0,arr[i].length()-1));
            }
        }

        if(x==0){

        }else if (x==1){
            answer+="x";
        }else{
            answer+=x+"x";
        }
        
        if (n==0){
            
        }else if (x==0){
            answer+=n;
        }else{
            answer +=" + "+n;
        }
        
        return answer;
    }
}