function solution(a, b, c) {
    
    const cal1 = a + b + c;
    const cal2 = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
    const cal3 = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
    
    if (a !== b && a !== c && b !== c) {
        return cal1;
    } else if (a === b && b === c) {
        return cal1 * cal2 * cal3;
    } else {
        return cal1 * cal2;
    }
}