class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int plus = 0;
        int square = 0;
        int answer = 0;
        
        
        for(int i = 0; i < num_list.length; i++){
            product *= num_list[i];
            plus += num_list[i];
            square = plus * plus;
            
            if(product < square){
                answer = 1;
            }else if(product > square){
                answer = 0;
            }
        }
        
        return answer;
    }
}