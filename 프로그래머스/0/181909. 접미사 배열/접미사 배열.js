function solution(my_string) {
    
    let answer = [];
    
    for (let i = 0; i < my_string.length; i++) {
        
        let str = '';
        for (let j = i; j < my_string.length; j++) {
            str += my_string[j];
        }
        answer.push(str);
    }
    
    return answer.sort();
}