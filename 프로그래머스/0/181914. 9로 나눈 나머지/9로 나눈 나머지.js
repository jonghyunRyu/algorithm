function solution(number) {
    
    return [...number].reduce((a, v) => a + Number(v), 0) % 9;
}