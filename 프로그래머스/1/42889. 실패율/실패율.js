function solution(N, stages) {
    
    const stageUsers = new Array(N + 2).fill(0);
    for (const stage of stages) {
        stageUsers[stage]++;
    }
    
    let fails = new Map();
    let total = stages.length;
    for (let i = 1; i < stageUsers.length - 1; i++) {
        if (stageUsers[i] === 0) {
            fails.set(i, 0);
            continue;
        }
        
        fails.set(i, stageUsers[i] / total);
        total -= stageUsers[i];
    }
    
    let answer = [...fails].sort((a, b) => b[1] - a[1]);
    
    return answer.map(v => v[0]);
}