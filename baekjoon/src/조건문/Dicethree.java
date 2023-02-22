//백준 조건문 2480번 문제
//조건에 따라 상금을 계산하는 문제
package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dicethree {
    public static void main(String[] args) throws IOException {
        // 버퍼드리더를 통해 입력을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        // A, B, C에 입력받은 값을 정수로 저장
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int money = 0; // 계산한 돈 저장
        // 조건문 시작
        if (A == B && B == C) { // 모든 수가 같은 경우
            money = 10000 + A * 1000;
            System.out.println(money);
        } else if (A == B || A == C) { // 두 수가 같은 경우 (그 값이 A인 경우)
            money = 1000 + A * 100;
            System.out.println(money);
        } else if (B == C) { // B와 C가 같은 경우
            money = 1000 + B * 100;
            System.out.println(money);
        } else { // 세 수가 다 다른 경우
            int max = 0;
            // 가장 큰 수를 찾는 조건문
            if (A > B) {
                if (A > C) {
                    max = A;
                    money = max * 100;
                    System.out.println(money);
                } else {
                    max = C;
                    money = max * 100;
                    System.out.println(money);
                }
            } else {
                if (B > C) {
                    max = B;
                    money = max * 100;
                    System.out.println(money);
                } else {
                    max = C;
                    money = max * 100;
                    System.out.println(money);
                }
            }
        }
    }
}
