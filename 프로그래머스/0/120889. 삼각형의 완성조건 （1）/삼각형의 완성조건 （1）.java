import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides); //배열 오름차순 정렬
        
        if (sides[2] < sides[0] + sides[1]) {
            return 1; // 삼각형을 만들 수 있음
        } else {
            return 2; // 삼각형을 만들 수 없음
        }
    }
}