function solution(n, k, cmd) {
    // 연결 리스트 역할
    const prev = Array(n);
    const next = Array(n);
    
    // 결과 테이블
    const answer = Array(n).fill('O');
    
    // 삭제 기록 stack
    const deleted = [];
    
    // 초기 연결 설정
    for (let i = 0; i < n; i++) {
        prev[i] = i - 1;
        next[i] = i + 1;
    }
    
    next[n - 1] = -1;
    
    let cur = k;
    
    for (const c of cmd) {
        const [type, count] = c.split(' ');
        
        // 위 이동
        if (type === 'U') {
            let move = Number(count);
            
            while (move--) {
                cur = prev[cur];
            }
        }
        
        // 아래 이동
        else if (type === 'D') {
            let move = Number(count);
            
            while (move--) {
                cur = next[cur];
            }
        }
        
        // 삭제
        else if (type === 'C') {
            deleted.push([cur, prev[cur], next[cur]]);
            
            answer[cur] = 'X';
            
            // 이전 노드 연결 수정
            if (prev[cur] !== -1) {
                next[prev[cur]] = next[cur];
            }
            
            // 다음 노드 연결 수정
            if (next[cur] !== -1) {
                prev[next[cur]] = prev[cur];
            }
            
            // 커서 이동
            if (next[cur] !== -1) {
                cur = next[cur];
            } else {
                cur = prev[cur];
            }
        }
        
        // 복구
        else if (type === 'Z') {
            const [restore, p, n] = deleted.pop();
            
            answer[restore] = 'O';
            
            if (p !== -1) {
                next[p] = restore;
            }
            
            if (n !== -1) {
                prev[n] = restore;
            }
        }
    }
    
    return answer.join('');
}