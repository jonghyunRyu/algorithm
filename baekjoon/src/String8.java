//백준 문자열 1152번 문제
//단어의 개수를 구하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 문자열을 공백으로 구분하여 st에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        // st의 토큰갯수 출력 = 공백으로 구분된 문자 갯수
        System.out.println(st.countTokens());
    }
}
