function solution(priorities, location) {
    
    let answer = 0;
    let max = 0;
    const order = new Array(priorities.length).fill(0).map((_, i) => i);
    
    while (priorities.length !== 0) {
        max = Math.max(...priorities);
        
        if (priorities[0] < max) {
            priorities.push(priorities.shift());
            order.push(order.shift());
        } else {
            answer++;
            priorities.shift();
            if (order.shift() === location) {
                return answer;
            }
        }
    }
}