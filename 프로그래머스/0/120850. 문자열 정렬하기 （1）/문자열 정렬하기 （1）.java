import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // 정규식으로 알파벳 소문자 제거 (대문자까지 포함하려면 "[^0-9]" 사용)
        my_string = my_string.replaceAll("[a-z]", "");

        // 숫자 개수만큼 배열 생성
        int[] answer = new int[my_string.length()];

        // 문자열의 각 숫자를 정수 배열로 변환
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - '0';
        }

        // 배열 정렬
        Arrays.sort(answer);

        return answer;
    }
}
