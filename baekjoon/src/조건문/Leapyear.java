//백준 조건문 2753번 문제
//윤년을 판별하는 문제
package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leapyear {
    public static void main(String[] args) throws IOException {
        //버퍼드리더로 값을 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        //문자를 정수로 변환
        int year = Integer.parseInt(s);

        if (year % 400 == 0) { //400으로 나눠지는 년도는 윤년
            System.out.println(1);
        } else if (year % 4 == 0 && year % 100 != 0) { //4로 나눠지며 100으로 나눠지지 않는 해는 윤년
            System.out.println(1);
        } else { //그 외는 일반 년도
            System.out.println(0);
        }
    }
}
