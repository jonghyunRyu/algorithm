import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, V;
	static List<List<Integer>> graph = new ArrayList();
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		V = Integer.parseInt(st.nextToken()); // 시작할 정점
		visited = new boolean[N + 1];
		
		// 그래프 생성
		for (int i = 0; i <= N; i++) { // 리스트의 접근 에러가 날 수 있음 0부터 생성
			graph.add(new ArrayList());
		}
		
		// 간선 정보 입력
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		
		// 정점 번호가 작은 순으로 정렬
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
		}
		
		// dfs
		dfs(V);
		sb.append("\n");
		Arrays.fill(visited, false);
		
		// bfs
		Queue<Integer> q = new LinkedList();
		q.offer(V);
		visited[V] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			sb.append(cur).append(" ");
			
			for (int i : graph.get(cur)) {
				if (!visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
		
		System.out.println(sb);
		
	}
	
	static void dfs(int cur) {
		visited[cur] = true;
		sb.append(cur).append(" ");
		
		for (int next : graph.get(cur)) {
			if (!visited[next]) {
				dfs(next);
			}
		}
	}
}