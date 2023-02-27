//백준 반복문 2739번 문제
//구구단을 출력하는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int N = Integer.parseInt(s);
        //반복문 시작
        for (int i=1; i < 10; i++) { // 1 ~ 9까지 반복하며 아래 내용 출력
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
