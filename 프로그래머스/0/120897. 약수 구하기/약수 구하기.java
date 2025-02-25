class Solution {
    public int[] solution(int n) {
        // 1. 약수 개수 세기
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // 약수 개수 증가
            }
        }

        // 2. 정확한 크기의 배열 생성
        int[] answer = new int[count];

        // 3. 다시 돌면서 약수를 배열에 저장
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++; // 다음 배열 칸으로 이동
            }
        }

        return answer;
    }
}
