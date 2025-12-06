import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        int num = 1;
        while (num < arr[0]) {
            stack.push(num);
            sb.append('+').append('\n');
            num++;
        }
        
        num++;
        sb.append('+').append('\n').append('-').append('\n');
        
        boolean ox = true;
        for (int i = 1; i < N; i++) {

            if (arr[i-1] > arr[i]) {
                
                int pop = stack.pop();
                sb.append('-').append('\n');

                if (pop != arr[i]) {
                    System.out.println("NO");
                    ox = false;
                    break;
                } 

            } else {
                while (num < arr[i]) {
                    sb.append('+').append('\n');
                    stack.push(num);
                    num++;
                }
                sb.append('+').append('\n').append('-').append('\n');
                num++;
            }
        }

        if (ox == true) {
            System.out.println(sb);
        }
    }
}