// 백준 일반 수학 11005번 문제 난이도(브론즈1)
// 10진법의 수를 다른 진법의 수로 출력하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arith {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //10진법 수를 입력받음
        int B = Integer.parseInt(st.nextToken()); //2~36사이의 진법을 입력받음

        int i = 1;
        int count = 1;
        // 자릿수를 알아내는 반복문
        while (N / i >= B) {
            i *= B;
            count++;
        }
        // 자릿수만큼 문자배열생성
        char[] ch = new char[count];
        int num = N;
        // 0번째 인덱스부터 끝자리 수를 저장
        for (int j = 0; j < count; j++) { 
            if (num % B > 9) { // 10부터 A문자열이 되도록 저장
                ch[j] = (char)(num % B + '7');
                num /= B;
            } else { // 0 ~ 9사이의 수를 저장
                ch[j] = (char)(num % B + '0');
                num /= B;
            }
        }
        // 배열을 거꾸로 출력
        for (int j = count-1; j >= 0; j--) {
            System.out.print(ch[j]);
        }
    }
}
