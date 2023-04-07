// 백준 스택 알고리즘 10773번 문제 난이도 (실버4)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> stack = new Stack<>();
        
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            
            int num = Integer.parseInt(br.readLine());
            // 0이 아니면 푸쉬 0이면 pop
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) { // 스택 크기 만큼 반복
            sum += stack.elementAt(i);  //stack배열의 값을 더함
        }

        System.out.println(sum);
    }
}
