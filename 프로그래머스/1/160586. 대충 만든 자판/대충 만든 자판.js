function solution(keymap, targets) {
    // A ~ Z 최소값 저장할 배열 생성
    const dict = Array(26).fill(Infinity);
    
    // keymap을 전체 순회하며 각 알파벳 최소값을 갱신
    keymap.forEach(key => {
        [...key].forEach((char, idx) => {
            const c = char.charCodeAt(0) - 65;
            if (idx + 1 < dict[c]) dict[c] = idx + 1;
        });
    });
   
    // target을 순회한 뒤 결과값 반환
    return targets.map(word => {
        let total = 0;
        
        for (const c of word) {
            const press = dict[c.charCodeAt(0) - 65];
            
            if (press === Infinity) return -1; // 해당 문자 입력 불가
            total += press;
        }
        
        return total;
    });
}