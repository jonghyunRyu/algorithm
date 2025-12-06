import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 시작 위치
		int K = Integer.parseInt(st.nextToken()); // 도착 위치
		
		boolean[] visited = new boolean[100001]; // 방문 여부 확인
		int[] arr = new int[100001]; // 걸린 시간 체크
		
		Queue<Integer> q = new LinkedList();
		
		int start = N;
		
		q.offer(start);
		visited[start] = true;
		arr[start] = 0; // 시작은 0초
		
		while (!q.isEmpty()) {
			int now = q.poll();
			
			// 도착하면 출력
			if (now == K) {
				System.out.println(arr[now]);
				return;
			}
			
			// 1초에 움직일 수 있는 방법
			int[] move = {now - 1, now + 1, now * 2};
			
			for (int next : move) {
				// 배열 범위를 벗어나지 않고 방문하지 않은 곳이면 움직임
				if (next >= 0 && next <= 100000 && !visited[next]) {
					visited[next] = true;
					arr[next] = arr[now] + 1;
					q.offer(next);
				}
			}
		}
		
		br.close();
	}
}