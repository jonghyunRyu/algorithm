function solution(n) {
    
    const arr = new Array(n).fill(0).map((_, i) => i + 1);
    
    if (n % 2 === 0) {
        return arr.reduce((a, v) => {
            if (v % 2 === 0) return a + v * v;
            else return a;
        }, 0);
    } else {
        return arr.reduce((a, v) => {
            if (v % 2 !== 0) return a + v;
            else return a;
        }, 0);
    }
}