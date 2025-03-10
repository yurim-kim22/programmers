import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 1. 소문자로 변환
        String a = my_string.toLowerCase();
        
        // 2. 문자 배열로 변환 후 정렬
        char[] arr = a.toCharArray();
        Arrays.sort(arr);

        // 3. 정렬된 문자 배열을 문자열로 변환
        String answer = new String(arr);
        
        return answer;
    }
}
