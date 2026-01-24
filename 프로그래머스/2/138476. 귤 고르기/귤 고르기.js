function solution(k, tangerine) {
    let answer = 0;
    let obj = {};

    tangerine.forEach((v) => {
        if (v in obj === false) {
            obj[v] = 1;
        } else {
            obj[v] = obj[v] + 1;
        }
    });

    let result = Object.values(obj).sort((a, b) => b - a);
    
    for (const value of result) {
        answer++;
        if (k > value) {
            k -= value;
        } else {
            break;
        }
    }
    
    return answer;
}