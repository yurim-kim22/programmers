class Solution {
    public int solution(int num, int k) {
        
        int answer = 0;
        
        for(int i = 0; i <= num ; i++){
            if(num[i] == k){
                answer = i
            }else{
                i=-1;
            }
            
        }
        return answer;
    }
}