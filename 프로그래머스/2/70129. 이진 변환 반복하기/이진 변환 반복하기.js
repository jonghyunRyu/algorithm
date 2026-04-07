function solution(s) {
    let answer = [];
    let count = 0;
    let zero = 0;

    while (s.length > 1) {
        zero += s.length - s.replaceAll('0', '').length;
        s = s.replaceAll('0', '').length.toString(2);
        count++;
    }
    
    answer.push(count);
    answer.push(zero);
    
    return answer;
}