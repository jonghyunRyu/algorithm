//백준 문자열 2743번 문제
//문자열을 입력받고 길이를 재는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str.length());
    }
}
