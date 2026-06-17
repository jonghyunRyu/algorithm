function solution(order) {
    
    return [...String(order)].reduce((a, v) => {
        if (v === '3' || v === '6' || v === '9') return a + 1;
        else return a;
    }, 0);
} 