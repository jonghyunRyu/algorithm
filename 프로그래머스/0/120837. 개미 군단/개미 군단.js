function solution(hp) {
    
    let answer = 0;
    let total = hp;
    let general = Math.floor(hp / 5);
    
    if (hp % 5 === 0) return general;
    
    total -= general * 5;
    answer += general;
    
    answer += Math.floor(total / 3);
    answer += total % 3;
    
    return answer;
}