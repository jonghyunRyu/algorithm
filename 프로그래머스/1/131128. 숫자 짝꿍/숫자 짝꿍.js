function solution(X, Y) {
    let answer = '';
    
    const arrX = X.split('');
    const arrY = Y.split('');
    
    for (let i = 9; i >= 0; i--) {
        const numXLen = arrX.filter(num => Number(num) === i).length;
        const numYLen = arrY.filter(num => Number(num) === i).length;
        answer += String(i).repeat(Math.min(numXLen, numYLen));
    }
    
    if (answer.length === 0) {
        return "-1";
    }
    
    if (Number(answer) === 0) {
        return "0";
    }
    
    return answer;
}