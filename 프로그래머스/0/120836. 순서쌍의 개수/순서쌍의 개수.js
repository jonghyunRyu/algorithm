function solution(n) {
    
    let answer = 0;
    const root = Math.sqrt(n);
    for (let i = 1; i < root; i++) {
        if (n % i === 0) answer++;
    }
    
    if (Math.floor(root) ** 2 !== n) {
        return answer * 2;
    } else {
        return answer * 2 + 1;
    }
}