//백준 조건문 9498번 문제
// 시험 점수를 성적으로 바꾸는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testscore {
    public static void main(String[] args) throws IOException {
        // 입력받은 수를 score에 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int score = Integer.parseInt(s);
        
        if ( score >= 90 ) { // 90이상은 A를 출력
            System.out.println("A");
        } else if ( score >= 80 ) { // 80이상 90미만은 B를 출력
            System.out.println("B");
        } else if ( score >= 70 ) { // 70이상 80미만은 C를 출력
            System.out.println("C");
        } else if ( score >= 60 ) { // 60이상 70미만은 D를 출력
            System.out.println("D");
        } else { // 나머지는 F를 출력
            System.out.println("F");
        }
    }
}
