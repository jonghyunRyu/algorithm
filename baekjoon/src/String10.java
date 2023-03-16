//백준 문자열 5622번 문제
//규칙에 따라 문자에 대응하는 수를 출력하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;
        // 다이얼 문자에 따라 걸리는 시간을 sum에 더함
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'A' : case 'B' : case 'C' :
                sum += 3;
                break;

                case 'D' : case 'E' : case 'F' :
                sum += 4;
                break;
                
                case 'G' : case 'H' : case 'I' :
                sum += 5;
                break;

                case 'J' : case 'K' : case 'L' :
                sum += 6;
                break;

                case 'M' : case 'N': case 'O' : 
				sum += 7; 
				break;

                case 'P' : case 'Q': case 'R' : case 'S' :
				sum += 8; 
				break;

                case 'T' : case 'U': case 'V' : 
				sum += 9; 
				break;
                
                case 'W' : case 'X': case 'Y' : case 'Z' : 
				sum += 10; 
				break;
            }
        }
        // 총 걸리는 시간 출력
        System.out.println(sum);
    } 
}  

