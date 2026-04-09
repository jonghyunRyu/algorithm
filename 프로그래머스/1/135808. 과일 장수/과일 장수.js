function solution(k, m, score) {
    let answer = 0;
    const arr = score.sort((a, b) => b - a);
    
    for (let i = m - 1; i < arr.length; i += m) {
        answer += arr[i] * m; 
    }
    
    return answer;
}