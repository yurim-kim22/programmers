class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if(flag == true){
            answer = a + b;
        }else if(flag == false){
            answer = a - b;
        }
        
        return answer;
    }
}