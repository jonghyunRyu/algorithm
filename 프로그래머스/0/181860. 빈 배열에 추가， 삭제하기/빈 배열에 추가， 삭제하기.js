function solution(arr, flag) {
    let answer = [];
    arr.forEach((v, i) => {
        if (flag[i]) {
            answer.push(...Array(v * 2).fill(v));
        }
        else {
            for (let i = 0; i < v; i++) {
                answer.pop();
            }
        }
    });
    return answer;
}