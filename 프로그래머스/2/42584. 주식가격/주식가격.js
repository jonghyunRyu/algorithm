// function solution(prices) {
    
//     let answer = [];
    
//     for (let i = 0; i < prices.length; i++) {
        
//         const price = prices[i];
//         let period = 0;
        
//         for (let j = i + 1; j < prices.length; j++) {
//             period++;
//             if (prices[j] < price) break;
//         }
        
//         answer.push(period);
//     }
    
//     return answer;
// }

// 시간복잡도 개선
function solution(prices) {
    
    const n = prices.length;
    const answer = new Array(n).fill(0);
    
    const stack = [0];
    for (let i = 1; i < n; i++) {
        while (stack.length > 0 && prices[i] < prices[stack[stack.length - 1]]) {
            const j = stack.pop();
            answer[j] = i - j;
        }
        
        stack.push(i);
    }
    
    while (stack.length > 0) {
        const j = stack.pop();
        answer[j] = n - 1 - j;
    }
    
    return answer;
}