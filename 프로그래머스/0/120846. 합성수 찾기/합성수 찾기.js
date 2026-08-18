function solution(n) {
    
    if (n < 4) return 0;
    
    let answer = 0;
    for (let i = 4; i <= n; i++) {
        
        const num = Math.sqrt(i);

        for (let j = 2; j <= num; j++) {
            if (i % j === 0) {
                answer++;
                break;
            }
        }
    }
    
    return answer;
}