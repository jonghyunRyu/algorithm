//백준 심화1 25206번 문제 난이도(실버5)
//과목 학점과 성적을 입력받아 학점 평균을 구하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yourgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        
        double sum = 0; // 총 학점
        double[] score = new double[20]; //입력받은 학점 * 성적의 값을 저장할 배열선언

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            // 각 학점별로 점수를 계산하여 저장
            switch (grade) {
                case "A+" : score[i] = 4.5 * a;
                    break;
                case "A0" : score[i] = 4.0 * a;
                    break;
                case "B+" : score[i] = 3.5 * a;
                    break;
                case "B0" : score[i] = 3.0 * a;
                    break;
                case "C+" : score[i] = 2.5 * a;
                    break;
                case "C0" : score[i] = 2.0 * a;
                    break;
                case "D+" : score[i] = 1.5 * a;
                    break;
                case "D0" : score[i] = 1.0 * a;
                    break;
                case "F" : score[i] = 0;
                    break;
                case "P" : continue;
            }
            // P일 경우에는 계산하지 않음
            if (grade != "P") {
                sum += a;
            }
        }

        double total = 0; //학점*성적을 다 더한 값
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        //전공평점 출력
        System.out.println(total / sum);
    }
}