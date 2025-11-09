import java.util.*;
class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        double std= Math.pow(d,2);
        
        for(int i=0;i<=d;i+=k){
            double a=Math.pow(i,2);
            int max_Y= (int)Math.sqrt(std-a);            
            answer+=max_Y/k+1;
        }
        
        return answer;
    }
}