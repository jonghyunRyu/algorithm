//백준 조건문 2884번 문제
//시간 계산 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock {
    public static void main(String[] args) throws IOException {
        // 버퍼드리더를 통해 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        // 입력 받은 값을 띄어쓰기에 따라 각각 h, m에 정수형태로 저장
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if (m - 45 < 0) { // 분이 45분 미만인 경우
            if (h == 0) { // 시간이 0인 경우
                System.out.println(23 + " " + (m + 15)); // 23시 분을 계산하여 출력
            } else { // 그 외의 경우엔 1시간을 빼고 분을 출력
                System.out.println((h - 1) + " " + (m + 15));
            }
        } else { // 분이 45분 이상인 경우 시간의 변화가 없기 때문에
            System.out.println(h + " " + (m - 45)); // 그대로 시간과 45분 뺀 분을 출력
        }
    }
}
