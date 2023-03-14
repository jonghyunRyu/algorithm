//백준 문자열 11720번 문제
//정수를 문자열로 입력받는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        // N번 반복
        for (int i = 0; i < N; i++) {
            sum += (int)str.charAt(i)-48; // 문자열 각 자리를 정수형으로 변환 후 더함
        }
        System.out.println(sum);
    }
}
