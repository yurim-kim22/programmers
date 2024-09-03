public class Solution {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 50 && num % 2 == 0) {
                result[i] = num / 2;
            } else if (num < 50 && num % 2 != 0) {
                result[i] = num * 2;
            } else {
                result[i] = num;
            }
        }

        return result;
    }
}
