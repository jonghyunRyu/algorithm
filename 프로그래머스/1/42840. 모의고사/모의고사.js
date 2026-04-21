function solution(answers) {
    
    const score = [0, 0, 0];
    const ansDict2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const ansDict3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    let answer = [];
    
    // 몇 문제 맞춘지 계산
    for (let i = 0; i < answers.length; i++) {
        // 1번 수포자 
        if (answers[i] === i % 5 + 1) score[0]++;            
        // 2번 수포자
        if (answers[i] === ansDict2[i % 8]) score[1]++;
        // 3번 수포자
        if (answers[i] === ansDict3[i % 10]) score[2]++;
    }
    
    // 가장 높은 점수
    const highScore = Math.max(...score);
    for (let i = 0; i < 3; i++) {
        if (score[i] === highScore) answer.push(i + 1);
    }
    
    
    return answer;
}