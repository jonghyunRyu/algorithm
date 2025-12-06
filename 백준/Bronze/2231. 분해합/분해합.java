import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N_len = s.length(); // 입력받은 N의 길이

        int N = Integer.parseInt(s);
        int result = 0;
        // N - N_length부터 검색
        for (int i = N - N_len * 9; i < N; i++) {

            int number = i;
            int sum = 0;
            // 각 자리 수 더하기
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}