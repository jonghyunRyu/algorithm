function solution(participant, completion) {
    
    let answer = '';
    const player = new Map();
    
    for (const p of participant) {
        player.set(p, (player.get(p) || 0) + 1);
    }
    
    for (const c of completion) {
        const value = player.get(c);
        
        if (value === 1) player.delete(c);
        else player.set(c, player.get(c) - 1);
    }
    
    for (const p of player.keys()) {
        answer = p;    
    }
    
    return answer;
}