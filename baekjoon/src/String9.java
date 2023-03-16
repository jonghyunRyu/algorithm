//백준 문자열 2908번 문제
//숫자를 뒤집어서 비교하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringBuilder타입에 st(String)을 받고 거꾸로 뒤집은 뒤 스트링타입으로 변환후 정수형으로 변환하여 A, B에 저장
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        //A > B이면 A를 출력 아닐 경우 B출력
        System.out.println(A > B ? A : B);
    }
}
