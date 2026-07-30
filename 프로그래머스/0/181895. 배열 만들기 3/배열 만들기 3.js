function solution(arr, intervals) {
    let answer = [];
    intervals.map(v => {
        answer.push(...arr.slice(v[0], v[1] + 1));
    });
    
    return answer;
}