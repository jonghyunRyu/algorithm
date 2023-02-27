//백준 조건문 2525번 문제
//범위가 더 넓은 시간 계산 문제
//방식1 
//현재 시간과 걸리는 시간의 합이 23시, 60분을 넘어가는 경우의 수를 생각하여 조건식으로 처리하여 출력
//조건식이 너무 자주 등장하여 보기에 복잡함

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock {
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
        //조건문 시작
        if (B + C < 60) { // 분과 걸리는 시간의 합이 60분 미만일 때
            System.out.println(A + " " + (B + C)); // 시간이 증가되지 않기 때문에 걸리는 시간을 더 한 값을 그대로 출력
        } else { // 현재 분과 걸리는 시간의 합이 60분 이상일 때
            if (B + C % 60 < 60) { // 걸리는 시간을 60분으로 나누고 남은 분과 현재 분의 합이 60분 미만일 때
                if (A + C / 60 > 23) { // 걸리는 시간과 현재 시작의 합이 23시를 넘어갈 때
                    System.out.println((A + C / 60 - 24) + " " + (B + C % 60)); 
                } else { // 23시를 넘어가지 않을 때
                    System.out.println((A + C / 60) + " " + (B + C % 60));
                }
            } else { // 걸리는 시간을 60분으로 나누고 남은 분과 현재 분의 합이 60분 이상일 때
                if (A + C / 60 >= 23) { // 23시가 포함되는 이유는 걸리는 시간이 60분 미만일 경우 때문
                    System.out.println((A + C / 60 - 23) + " " + (B + C % 60 - 60));
                } else {
                    System.out.println((A + C / 60 + 1) + " " + (B + C % 60 - 60));
                }
            }
        }
    }
}
