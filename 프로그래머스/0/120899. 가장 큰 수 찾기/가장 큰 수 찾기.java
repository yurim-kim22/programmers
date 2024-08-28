public class Solution {
    public int[] solution(int[] array) {
        // 초기화: 가장 큰 수와 그 인덱스를 저장할 변수
        int maxValue = array[0];
        int maxIndex = 0;
        
        // 배열을 순회하면서 최대값과 인덱스를 찾음
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        
        // 결과를 배열로 반환
        return new int[]{maxValue, maxIndex};
    }
}
