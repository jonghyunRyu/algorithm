//백준 심화 1단계 10988번 문제
//팰린드롬인지 확인하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int pa = 1; // 팰린드롬이면 1 아니면 0
        //문자길이의 절반만 확인하면 되기 때문에 길이의 절반 반복
        for (int i = 0; i < str.length()/2; i++) {
            //서로 대치되는 문자열 확인하여 아닐 시 0을 저장
            if (str.charAt(i) != str.charAt(str.length()-i-1)) { 
                pa = 0;
                break;
            }
        }

        System.out.println(pa);
    }
}
