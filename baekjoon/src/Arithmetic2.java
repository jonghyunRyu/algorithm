// 백준 일반 수학 2745번 문제 풀이수정
// 첫 번째보다 가독성이 좋고 간결해졌다. 
// if문에 문자 'A'와 'Z'사이의 수로 간단히 조건문을 만들 수 있다는 걸 알았다.
// 그리고 자주 사용되는 str.charAt(i)를 c에 저장하여 코드를 간결하게 했다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arithmetic2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int num = 0; // 10진법으로 표현된 수 저장할 변수
        int tmp = 1; // 자릿수의 제곱역할

        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);

            if ('A' <= c && c <= 'Z') { // A~Z사이의 수면
                num += (c-'A'+10) * tmp; // A=10~Z=35로 계산하여 자릿수마다 값을 num에 저장
            } else {
                num += (c-'0') * tmp; // 0~9사이 수일 때
            }
            tmp *= n;
        }
        System.out.println(num);
    }
}
