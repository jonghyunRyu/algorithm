// 백준 스택 알고리즘 9012번 문제 난이도 (실버4)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis {
    // VPS인지 확인하는 메소드
    public static String solve(String s) {
        
        Stack<Character> stack = new Stack<>(); //Stack 생성

        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) { //'('가 안채워진상태에서 ')'이면 바로 NO를 출력
                return "NO";
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine()));
            sb.append('\n');
        }
        
        System.out.println(sb);   
    }
}
