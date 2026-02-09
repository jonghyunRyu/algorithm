function solution(s) {
    
    const circular = s.concat(s);
    const len = s.length;
    let answer = 0;
    
    for (let i = 0; i < len; i++) {
        
        let arr = [];
        for (let j = i; j < len + i; j++) {
            if (arr.length === 0) {
                arr.push(circular[j]);
                
            } else if (arr[arr.length-1] === '(' && circular[j] === ')') {
                arr.pop();
                
            } else if (arr[arr.length-1] === '[' && circular[j] === ']') {
                arr.pop();
                
            } else if (arr[arr.length-1] === '{' && circular[j] === '}') {
                arr.pop();
                
            } else {
                arr.push(circular[j]);
            }
        } 
        
        if (arr.length === 0) {
            answer++;
        } 
    }
    
    return answer;
}