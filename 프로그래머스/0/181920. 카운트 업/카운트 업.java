class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int size = end_num - start_num + 1;
        int[] answer = new int[size];
        int count = 0;
        
        for(int i = start_num; i <= end_num; i++){
            answer[count] = i;
            count++;
        }
        
        return answer;
    }
}