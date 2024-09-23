import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {

        int kim = Arrays.asList(seoul).indexOf("Kim");
        
        String answer = "김서방은 " + kim + "에 있다";
        
        return answer;
    }
}