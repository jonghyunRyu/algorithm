function solution(my_string) {
    let answer = '';
    
    for (const c of my_string) {
        if (c.toUpperCase() === c) answer += c.toLowerCase();
        else answer += c.toUpperCase();
    }
    
    return answer;
}