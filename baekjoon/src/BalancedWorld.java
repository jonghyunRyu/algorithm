// 백준 스택 알고리즘 4949번 문제 난이도 (실버4)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {
    // 문자열이 균형을 이루고 있는지 아닌지 판별하는 식
    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            // 문자열의 문자가 (이거나 [일 때 PUSH
            if (c == '(' || c == '[') {
                    stack.push(c);
                    
            } else if (c == ')') {
                // ) 일 때 스택이 비었으면 불균형, 스택 위의 값이 (가 아니면 불균형이므로 no리턴 
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else { // 그 외의 경우엔 (임으로 POP
                    stack.pop();
                }

            } else if (c == ']') {
                // )의 경우와 동일
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        // 모든 작업을 마치고 스택이 비어있으면 균형함으로 yes출력
        if (stack.empty()) {
            return "yes";
        } else { // 스택에 값이 남아있으면 불균형임으로 no출력
            return "no";
        }
    }
    

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = "";
        StringBuilder sb = new StringBuilder();

        while (true) {

            s = br.readLine();
            // while문 벗어나는 조건문
            if (s.equals(".")) {
                break;
            }

            sb.append(solve(s)).append('\n');
        }
        
        System.out.println(sb);
    }
}
