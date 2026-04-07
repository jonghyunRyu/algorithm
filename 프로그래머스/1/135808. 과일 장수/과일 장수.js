function solution(k, m, score) {
    
    if (score.length < m) {
        return 0;
    }

    score.sort((a, b) => b - a);
    const answer = score.reduce((a, v, i) => {
        if (i % m === m - 1) {
            return a + v * m;
        }
        
        return a;
    }, 0);
    
    return answer;
}