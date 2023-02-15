//백준 조건문 1330번 문제
// 두 수를 비교한 결과를 출력하는 문제
package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Comparenum {
    public static void main(String[] args) throws IOException {
        // 두 수를 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        // 두 수를 a, b에 저장
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if (a > b) { //a가 b보다 클 경우
            System.out.println(">");
        } else if (a < b) { // a가 b보다 작을 경우
            System.out.println("<");
        } else { // 두 수가 같을 경우
            System.out.println("==");
        }
    }
}
