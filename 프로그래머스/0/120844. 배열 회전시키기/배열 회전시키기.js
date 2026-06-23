function solution(numbers, direction) {
    
    let arr = numbers;
    
    if (direction === 'right') {
        const a = arr.pop();
        arr = [a, ...arr];
    } else {
        arr.push(arr.shift());
    }
    
    return arr;
}