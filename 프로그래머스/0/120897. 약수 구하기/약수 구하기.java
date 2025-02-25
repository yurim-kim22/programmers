import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
    ArrayList<Integer> answer = new ArrayList<>();//동적 배열 생성

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i); //리스트에 약수 추가
            }
        }
        // ArrayList를 int 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
