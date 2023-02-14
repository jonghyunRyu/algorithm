// 백준 입출력과 사칙연산 18108번
// 식을 직접 세워서 계산하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bangkok {
    public static void main(String[] args) throws IOException {
        //불기 연도를 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //정수로 변환 후 저장
        int byear = Integer.parseInt(str);
        
        //서기 연도
        int year = byear - 543;

        System.out.println(year);
    }
}
