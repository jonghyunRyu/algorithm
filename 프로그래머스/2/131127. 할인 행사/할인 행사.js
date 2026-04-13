function solution(want, number, discount) {
    let answer = 0;
    const cycle = discount.length - 9;
    for (let i = 0; i < cycle; i++) {
        
        let arr = discount.slice(i, i + 10);
        let flag = true;
        for (let j = 0; j < want.length; j++) {
            let num = 0;
            for (let k = 0; k < arr.length; k++) {
                if (arr[k] === want[j]) {
                    num++;
                }
            }
            
            if (num < number[j]) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            answer++;
        }
        
    }
    
    return answer;
}