// 백준 일반 수학 2745번 문제 난이도(브론즈 2)
// 36진법까지의 진법을 10진법으로 바꾸는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken(); //입력받은 수를 문자열에 저장 문자도 있기 때문
        int n = Integer.parseInt(st.nextToken());
        int num = 0; //10진법으로 나타낸 수를 저장할 변수
        
        for (int i = 0; i < str.length(); i++) {
            if ((int)str.charAt(i) > 57) { //9가 아스키코드로 57이기 때문에 57이상인 경우
                num += (int)(str.charAt(i) - 55) * Math.pow(n, str.length()-i-1); //대문자의 경우 A가 65부터 시작이기 때문에 이와 같이 계산
            } else {
                num += (int)(str.charAt(i) - 48) * Math.pow(n, str.length()-i-1); // 0~9일 경우 계산
            }
        }
        System.out.println(num);
    }
}