import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		int pos,a,b = 0;
		
		while (line != null) {
			pos = line.indexOf(" ");
			a = Integer.parseInt(line.substring(0, pos));
			b = Integer.parseInt(line.substring(pos+1));
			
			sb.append((a+b)).append('\n');
			line = br.readLine();
		}
		br.close();
		System.out.println((sb));
	}
}