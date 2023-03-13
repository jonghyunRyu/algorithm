//백준 문자열 27866번 문제
// 문자열을 입력받고 문자열의 특정 위치를 읽는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        // str N번째 문자열 출력
        System.out.println(str.substring(N-1, N));
    }
}
