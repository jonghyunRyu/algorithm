//백준 문자열 2675번 문제
//각 문자를 반복하여 출력하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // T만큼 반복
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            // 문자열 길이 만큼 반복
            for (int j = 0; j < str.length(); j++) {
                // 문자 반복해야되는 수만큼 반복
                for (int k = 0; k < num; k++) {
                    sb.append(str.charAt(j));
                }
            }
            if (i != T-1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
