function solution(num_str) {
    
    return [...num_str].reduce((a, v) => a + Number(v), 0);
}