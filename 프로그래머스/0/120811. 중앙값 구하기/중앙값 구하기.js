function solution(array) {
    const len = Math.floor(array.length / 2);
    array.sort((a, b) => a - b);
    
    return array[len];
}