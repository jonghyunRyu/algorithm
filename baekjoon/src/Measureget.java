// 백준 약수 2501번 문제 난이도 (브론즈3)
// K번째로 큰 약수를 출력하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Measureget {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0; // 약수의 갯수
        int num = 1; // 약수
        int result = 0; // K번째로 큰 약수

        while (true) {
            if (N % num == 0) { //약수의 경우 저장
                count++;
                result = num;
            }
            if (count == K || num >= N) { //구하고자 하는 약수인 경우와 num이 원래 수보다 커질 경우 break
                break;
            }
            num++; 
        }

        if (count < K) { // 구하는 값이 존재하지 않을 경우 0출력
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
