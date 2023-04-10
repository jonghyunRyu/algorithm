// 백준 스택 알고리즘 1874번 문제 난이도 (실버2)
// 스택 알고리즘에 대해 이해하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stackseq {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        Stack<Integer> stack = new Stack<>();
        // 입력을 받아 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        int num = 1;
        // 첫 값보다 작은 값을 stack에 1부터 쌓음
        while (num < arr[0]) { 
            stack.push(num);
            sb.append('+').append('\n');
            num++;
        }

        num++;
        sb.append('+').append('\n').append('-').append('\n');
        
        boolean ox = true; // 스트링을 출력할지 NO를 출력할지 구분하기 위한 변수

        for (int i = 1; i < N; i++) {

            if (arr[i-1] > arr[i]) { // 뒤에 오는 배열의 값이 적으면 무조건 pop을 해야함, 그리고 1보다 더 작은 경우 배열을 생성할 수 없음
                
                int pop = stack.pop();
                sb.append('-').append('\n');

                if (pop != arr[i]) { // NO를 출력하고 ox를 false로 한 뒤 break
                    System.out.println("NO");
                    ox = false;
                    break;
                } 

            } else {
                while (num < arr[i]) { // 뒤에 오는 배열의 값이 큰 경우 num의 값을 계속 증가시키며 stack에 쌓음
                    sb.append('+').append('\n');
                    stack.push(num);
                    num++;
                }
                sb.append('+').append('\n').append('-').append('\n');
                num++;
            }
        }

        if (ox == true) { // 배열 생성이 가능한 경우만 sb를 출력
            System.out.println(sb);
        }
    }
}
