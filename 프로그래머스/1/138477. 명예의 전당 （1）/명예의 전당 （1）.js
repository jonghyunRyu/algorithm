function solution(k, score) {
    let temp = [];
    let answer = [];
    
    for (let i = 0; i < score.length; i++) {
        if (temp.length === k) {
            if (Math.min(...temp) < score[i]) {
                const idx = temp.indexOf(Math.min(...temp));
                temp.splice(idx, 1);
                temp.push(score[i]);
            }
        } else {
            temp.push(score[i]);
        }
        
        answer.push(Math.min(...temp));
    }
    
    return answer;
}