//백준 반복문 25304번 문제
//영수증 값을 비교하는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bill {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st;
        //반복문 시작
        for (int i = 0; i < N; i++) { //입력받은 금액을 계산
            st = new StringTokenizer(br.readLine());
            sum += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }
        //조건문 시작
        if (total == sum) { // 영수증 값과 계산값이 동일하면 yes출력
            System.out.println("Yes");
        } else { // 틀릴 시 no 출력
            System.out.println("No");
        }
    }
}
