//백준 반복문 15552번 문제
//빠르게 입력받고 출력하는 문제
package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // 입력받은 케이스의 값을 더해서 스트링빌더에 저장
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        // 스트링빌더에 저장되어 있는 모든 값 출력
        System.out.println(sb);
    }
}
