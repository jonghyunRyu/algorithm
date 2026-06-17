function solution(cipher, code) {
    
    if (code === 1) return cipher;
    
    let answer = '';
    for (let i = 0; i < cipher.length; i++) {
        if (i !== 0 && (i + 1) % code === 0) answer += cipher[i];
    }
    
    return answer;
}