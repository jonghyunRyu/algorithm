import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	static int L, C;
	static char[] chars;
	static boolean[] isSelected;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		// 암호로 사용가능한 문자 종류들 입력
		st = new StringTokenizer(br.readLine());
		chars = new char[C];
		for (int i = 0; i < C; i++) {
			chars[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(chars);
		makePw(0, 0, "");
		System.out.println(sb);
	}
	
	static void makePw(int cnt, int start, String pw) {
		if (cnt == L) {
			if(checkPw(pw)) {
				sb.append(pw).append("\n");
			}
			return;
		}
		
		for (int i = start; i < C; i++) {
			makePw(cnt + 1, i + 1, pw + chars[i]);
		}
	}
	
	static boolean checkPw(String s) {
		
		boolean flag = false;
		int cnt = 0;
		
		for (char vowel : vowels) {
			if (s.indexOf(vowel) != -1) {
				flag = true;
				cnt++;
			}
		}
		
		if (s.length() - cnt >= 2 && flag) {
			return true;
		}
		
		return false;
	}
}