// 처음 풀이
// function solution(s) {
//     let answer = [];
//     const dict = new Map();
    
//     const arr = s.split('');
//     for (let i = 0; i < arr.length; i++) {
//         if (!dict.has(arr[i])) {
//             dict.set(arr[i], i);
//             answer.push(-1);
//         } else {
//             const location = i - dict.get(arr[i]);
//             dict.set(arr[i], i);
//             answer.push(location);
//         }
//     }
    
//     return answer;
// }

// 불필요한 연산 제거
function solution(s) {
    let answer = [];
    const dict = new Map();

    for (let i = 0; i < s.length; i++) {
        if (!dict.has(s[i])) {
            dict.set(s[i], i);
            answer.push(-1);
        } else {
            const location = i - dict.get(s[i]);
            dict.set(s[i], i);
            answer.push(location);
        }
    }
    
    return answer;
}