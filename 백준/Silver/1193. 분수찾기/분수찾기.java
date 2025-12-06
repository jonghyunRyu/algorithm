import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int corps = 1;

        for (int i=1; (i * (i+1)) / 2 < num; i++) {
            corps += 1;
        }

        int seq = num - (corps * (corps - 1)) / 2;
        if (corps % 2 == 1) {
            System.out.println(corps - seq + 1 + "/" + seq );
        } else {
            System.out.println(seq + "/" + (corps - seq + 1));
        }

    }
}