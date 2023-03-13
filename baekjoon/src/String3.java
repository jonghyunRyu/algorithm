//백준 문자열 9096번 문제
//문자열을 입력받고 양 끝 문자를 출력하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            //스트링 빌더에 첫문자와 끝문자를 저장
            sb.append(str.substring(0, 1)).append(str.substring(str.length()-1, str.length()));
            sb.append("\n");    //개행
        }
        //결과 출력
        System.out.println(sb);
    }
}
