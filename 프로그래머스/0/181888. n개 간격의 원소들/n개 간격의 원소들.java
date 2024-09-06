import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // int idx = 0;
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        //동적배열에 넣기
        for(int i = 0; i < num_list.length; i += n){
                answerList.add(num_list[i]); 
        }
        
        // ArrayList를 int[] 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}