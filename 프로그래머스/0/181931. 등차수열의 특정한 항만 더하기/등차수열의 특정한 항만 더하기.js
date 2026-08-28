function solution(a, d, included) {
    
    return Array.from({length: included.length}, 
        (_, i) => i * d + a).reduce((a, v, i) => {
            if (included[i]) return a + v;
            else return a;
    }, 0);
}