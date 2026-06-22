function solution(n_str) {
    
    let idx = 0;
    for (let i = 0; i < n_str.length; i++) {
        if (n_str[i] !== '0') {
            idx = i;
            break;
        }
    }
    
    return n_str.split('').slice(idx).join('');
}