import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
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