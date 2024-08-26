class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            // 대문자인 경우 소문자로 변환
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } 
            // 소문자인 경우 대문자로 변환
            else if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            }
        }
        
        return answer;
    }
}
