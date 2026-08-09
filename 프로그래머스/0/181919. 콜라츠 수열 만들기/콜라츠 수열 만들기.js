function solution(n) {
    
    let answer = [];
    
    while (n >= 1) {
        answer.push(n);
        
        if (n === 1) break;
        
        if (n % 2 === 0) n /= 2;
        else n = n * 3 + 1
    }
    
    return answer;
}