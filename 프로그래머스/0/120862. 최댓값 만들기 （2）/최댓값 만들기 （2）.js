function solution(numbers) {
    
    let answer = -Infinity;
    
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            const num = numbers[i] * numbers[j];
            
            if (num > answer) answer = num;
        }
    }
    
    return answer;
}