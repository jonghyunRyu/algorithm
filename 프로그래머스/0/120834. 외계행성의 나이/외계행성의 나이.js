function solution(age) {
    
    let answer = [];
    
    while (age >= 1) {
        let rest = age % 10;
        answer.push(rest);
        age = Math.floor(age / 10);
    }
    
    answer = answer.reverse();
    
    return answer.map(v => String.fromCharCode(v + 97)).join('');
}