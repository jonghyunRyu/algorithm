function solution(k, dungeons) {
    
    let answer = 0;
    const visited = Array(dungeons.length).fill(false);
    
    function dfs(pirodo, cnt) {
        answer = Math.max(answer, cnt);
        
        for (let i = 0; i < dungeons.length; i++) {

            const [min, use] = dungeons[i];

            if (visited[i]) continue;
            if (pirodo < min) continue;

            visited[i] = true;

            dfs(pirodo - use, cnt + 1);

            visited[i] = false;
        }
    }
    
    dfs(k, 0);
    
    return answer;
}