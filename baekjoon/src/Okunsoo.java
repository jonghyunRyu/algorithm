// 백준 스택 알고리즘 17928번 문제 난이도 (골드4)
/* 
 * 알고리즘을 생각해내는 것이 상당히 어려웠음. 
 * 처음 생각했던 방안은 시간 초과가 걸렸는데 그 이유는 시간 제한 때문
 * 이중 for문을 사용했는데 계산해보면 1,000,000개의 제곱은 1초가 넘게 걸림.
 * 그래서 다른 알고리즘이 필요했고 그 방식은 스택을 이용한 방법이었음.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Okunsoo {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
            
            /* 
             * 스택이 비어있지 않으면서 
             * 현재 원소가 스택의 맨 위 원소(인덱스)가 가르키는 배열 값보다 큰 경우
             * 해당 조건을 만족할 때까지 stack의 원소를 pop하면서 해당 인덱스의 값을 현재 원소로 바꿈.
             */

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
                
            }

            stack.push(i);
        }
        // stack 남아 있는 인덱스는 더 큰 값이 없는 경우이기 때문에 -1로 바꿔줌
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}
