function solution(clothes) {
    
    let answer = 1;
    const map = new Map();
    
    clothes.forEach(v => {
        map.set(v[1], (map.get(v[1]) || 0) + 1);    
    });
    
    for (const [key, value] of map) {
        answer *= (value + 1);
    }
    
    return answer - 1;
}