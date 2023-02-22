//백준 조건문 2525번 문제
//범위가 더 넓은 시간 계산 문제
//방식2 
//걸리는 시간과 현재 시간을 분으로 바꾸어 계산한 뒤 시간과 분으로 바꾸는 방식
package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock2 {
    public static void main(String[] args) throws IOException {
        // 버퍼드리더로 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 째줄은 s1, 두 번째줄은 s2에 저장
        String s1 = br.readLine();
        String s2 = br.readLine();
        // 띄어쓰기에 따라 s1을 A, B에 정수로 저장 
        StringTokenizer st = new StringTokenizer(s1);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(s2); //두 번째 줄 s2를 정수로 변환하여 저장
        // 현재 시간과 걸리는 시간의 합을 분으로 min에 저장
        int min = A * 60 + B + C;

        int hour = (min / 60) % 24; // min을 60분으로 나누어 시로 나타내고 24시가 넘어갈 경우를 위해 24의 나머지로 시간을 표시한다
        int minute = min % 60; // 분을 60의 나머지로 표시

        System.out.println(hour + " " + minute);
    }
}
