function solution(s) {
    let stack = [];
    
    for (let i = 0; i < s.length; i++) {
        if (stack.length === 0) {
            stack.push(s.charAt(i));
            continue;
        }
        
        if (s.charAt(i) === stack[stack.length - 1]) {
            stack.pop();
        } else {
            stack.push(s.charAt(i));
        }
    }
    
    return stack.length === 0 ? 1 : 0;
}