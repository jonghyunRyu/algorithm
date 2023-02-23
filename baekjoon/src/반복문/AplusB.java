//백준 반복문 10950번 문제
//A+B를 여러 번 출력하는 문제
package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 스트링을 정수로 변환하여 N에 저장
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        //반복문 시작
        for (int i = 0; i < N; i++) { // N만큼 반복
            st = new StringTokenizer(br.readLine()); //입력을 받음
            //스트링빌더에 계산한 값을 저장
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        //스트링 빌더를 출력
        System.out.println(sb);
    }
}

