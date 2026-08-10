function solution(numLog) {
    let answer = '';
    
    const con = {
        '1' : 'w',
        '-1' : 's',
        '10' : 'd',
        '-10' : 'a'
    }
    
    for (let i = 1; i < numLog.length; i++) {
        const c = numLog[i] - numLog[i - 1];
        
        answer += con[c];
    }
    
    return answer;
}