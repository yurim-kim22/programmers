class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // a ⊕ b 계산: 두 정수를 문자열로 변환하여 붙인 후 정수로 변환
        int abConcat = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        // 2 * a * b 계산
        int product = 2 * a * b;
        
        // abConcat과 product 중 더 큰 값을 반환, 같으면 abConcat 반환
        return Math.max(abConcat, product); 
        
    }
}