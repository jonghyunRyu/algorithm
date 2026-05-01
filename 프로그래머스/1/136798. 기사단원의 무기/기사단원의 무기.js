function solution(number, limit, power) {
    let answer = 0;
    
    for (let i = 1; i <= number; i++) {
        const att = countDivisors(i);
        
        if (att <= limit) {
            answer += att;
        } else {
            answer += power;
        }
    }
    
    return answer;
}

function countDivisors(n) {
    let count = 0;
    
    for (let i = 1; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            count++;
            if (i !== n / i) {
                count++;
            }
        }
        
        
    }
    
    return count;
}