function solution(progresses, speeds) {
    const days = progresses.map((v, i) => {
       return Math.ceil((100 - v) / speeds[i]); 
    });
    
    const answer = [];
    let checkDay = days[0];
    let count = 1;
    
    for (let i = 1; i < days.length; i++) {
        if (days[i] <= checkDay) {
            count++;
        } else {
            answer.push(count);
            checkDay = days[i];
            count = 1;
        }
    }
    
    answer.push(count);
    
    return answer;
}