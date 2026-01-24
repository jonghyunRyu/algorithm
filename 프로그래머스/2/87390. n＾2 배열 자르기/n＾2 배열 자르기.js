function solution(n, left, right) {
    return [...Array(right - left + 1)].map((a, b) => {
        let row = Math.floor((left + b) / n) + 1;
        let column = (left + b) % n + 1;
        
        if (row < column) {
            return column; 
        } else {
            return row;
        }
    });
    
}
