function solution(s) {
    let numArr = s.split(' ').map(v => Number(v));
    const min = Math.min(...numArr);
    const max = Math.max(...numArr);
    
    return min + " " + max;
}