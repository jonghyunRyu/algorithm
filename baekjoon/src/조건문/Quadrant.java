//백준 조건문 14681번 문제
//점이 어느 사분면에 있는지 알아내는 문제
package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrant {
    public static void main(String[] args) throws IOException { 
        // 버퍼드리더를 통해 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        // 입력 받은 a, b를 정수로 변환 후 각각 x, y에 저장
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        if (x > 0) { // x좌표가 양수일 때
            if (y > 0) { // y좌표가 양수면 1사분면
                System.out.println(1);
            } else { // y좌표가 음수면 4사분면
                System.out.println(4);
            }
        } else { // x좌표가 음수일 때
            if (y > 0) { // y좌표가 양수면 2사분면
                System.out.println(2);
            } else { // y좌표가 음수면 3사분면
                System.out.println(3);
            }
        }
    }
}
