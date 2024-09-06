class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n; // n 간격으로 선택된 원소들의 개수
        int[] answer = new int[size];  // size만큼 배열 생성
        int idx = 0;
            
        for(int i = 0; i < num_list.length; i += n){
                answer[idx++] = num_list[i]; 
        }
        
        return answer;
    }
}