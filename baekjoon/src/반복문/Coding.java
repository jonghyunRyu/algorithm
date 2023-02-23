//백준 반복문 24314번 문제
//입력값에 따라 반복문을 쓰는 문제
package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < N/4; i++) {
            sb.append("long ");
        }
        
        sb.append("long int");
        
        System.out.println(sb);
    }
}
