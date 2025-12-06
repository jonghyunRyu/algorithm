function solution(n) {
    
    const directions = [[1, 0], [0, 1], [-1, -1]];
    
    const arr = Array.from({ length: n }, () => new Array(n).fill(0));
    
    let row = -1;
    let col = 0;
    
    let value = 1;
    let nowDirIdx = 0;
    
    for (let i = n; i > 0; i--) {
        
        const [nrow, ncol] = directions[nowDirIdx]; 
            
        for (let j = 0; j < i; j++) {
            row += nrow;
            col += ncol;
            
            arr[row][col] = value;
            value++;
        }
        
        nowDirIdx = (nowDirIdx + 1) % 3;
    }
    
    return arr.flat().filter(v => v !== 0);
}