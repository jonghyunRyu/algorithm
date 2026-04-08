// 처음 풀이 shift() 메서드 사용 -> 배열의 길이가 길어지면 효율이 떨어짐 시간복잡도 증가
// function solution(cards1, cards2, goal) { 
//     for (let i of goal) {
//         if (i === cards1[0]) {
//             cards1.shift();
//         } else if (i === cards2[0]) {
//             cards2.shift();
//         } else {
//             return "No";
//         }
//     }
    
//     return "Yes";
// }

function solution(cards1, cards2, goal) {
    let j = 0;
    let k = 0;
    
    for (let i = 0; i < goal.length; i++) {
        if (goal[i] === cards1[j]) {
            j++;
        } else if (goal[i] === cards2[k]) {
            k++;
        } else {
            return "No";
        }
    }
    
    return "Yes";
}