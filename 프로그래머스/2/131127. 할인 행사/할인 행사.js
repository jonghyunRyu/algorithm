function solution(want, number, discount) {
    
    let answer = 0;
    let map = setMap(want, number);
    
    for (let i = 0; i <= discount.length - 10; i++) {
        
        map = setMap(want, number);
        for (let j = i; j < i + 10; j++) {
            if (map.get(discount[j]) === undefined) break;
            else {
                map.set(discount[j], map.get(discount[j]) - 1);
            }
        }
        
        let flag = true;
        for (const [key, value] of map) {
            if (value !== 0) {
                flag = false;
                break;
            }
        }
        
        if (flag) answer++;
    }
    
    return answer;
}

function setMap(want, number) {
    const map = new Map();
    for (let i = 0; i < want.length; i++) {
        map.set(want[i], number[i]);
    }
    
    return map;
}