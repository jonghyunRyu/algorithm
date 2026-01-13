import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] Integer1 = new int [T];
		int [] Integer2 = new int [T];
		for (int i = 0; i < T; i++) {
				Integer1[i] = sc.nextInt();
				Integer2[i] = sc.nextInt();
		}
		for (int i = 1; i <= T; i++ ) {
			System.out.println("Case #"+i+": "+(Integer1[i-1]+Integer2[i-1]));
		}
	}
}