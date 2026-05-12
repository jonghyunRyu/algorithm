function solution(my_string) {
    
    let answer = 0;
    
    for (const c of my_string) {
        const value = Number(c);

        if (value) answer += value;
    }
    
    return answer;
}