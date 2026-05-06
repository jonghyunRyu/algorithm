function solution(prices) {
    
    let answer = [];
    
    for (let i = 0; i < prices.length; i++) {
        
        const price = prices[i];
        let period = 0;
        
        for (let j = i + 1; j < prices.length; j++) {
            period++;
            if (prices[j] < price) break;
        }
        
        answer.push(period);
    }
    
    return answer;
}