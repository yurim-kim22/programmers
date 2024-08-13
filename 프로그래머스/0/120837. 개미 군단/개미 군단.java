class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        
        if(hp > 0){
            a = hp / 5;
            b = (hp % 5) / 3;
            c = (hp % 5) % 3 ;
            answer = a+b+c;
            
        }
        
        return answer;
    }
}