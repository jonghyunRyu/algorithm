function solution(a, b) {
    const cal1 = Number(String(a) + String(b));
    const cal2 = 2 * a * b;
    
    return cal1 >= cal2 ? cal1 : cal2;
}