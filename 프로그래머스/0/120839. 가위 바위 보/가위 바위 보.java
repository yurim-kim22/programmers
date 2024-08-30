class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        //가위 2
        //바위 0
        //보   5
        
        for(int i = 0; i < rsp.length(); i++){
            //rsp는 문자열이므로 각 문자에 접근하려면 charAt을 사용해야한다
             char current = rsp.charAt(i);
            if(current == '2'){
                answer += '0';
            }else if(current == '0'){
                answer += '5';
            }else if(current == '5'){
                answer += '2';
            }
        }
        
        return answer;
    }
}