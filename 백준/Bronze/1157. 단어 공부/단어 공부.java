import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if ((int)s.charAt(i) > 96) {
				arr[(char)(s.charAt(i)-97)]++;
			} else {
				arr[(char)(s.charAt(i)-65)]++;
			}
		}
		
		int max = arr[0];
		int result = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max ) {
				max = arr[i];
				result = i;
			}
		}
		
		Arrays.sort(arr);
		if (arr[arr.length-1] == arr[arr.length-2]) {
			System.out.println('?');
		} else {
			System.out.println((char)(result+65));
		}
	}
}