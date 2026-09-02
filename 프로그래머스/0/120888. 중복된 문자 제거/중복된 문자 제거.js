function solution(my_string) {
    
    let dict = [];
    let answer = [];
    
    [...my_string].forEach(v => {
        if (!dict.includes(v)) {
            answer.push(v);
            dict.push(v);
        }
    });
    
    return answer.join('');
}