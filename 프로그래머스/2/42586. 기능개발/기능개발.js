function solution(progresses, speeds) {
    const days = progresses.map((p, i) => 
        Math.ceil((100 - p) / speeds[i])
    );
    
    const result = [];
    let count = 1;
    let maxDay = days[0];
    
    for (let i = 1; i < days.length; i++) {
        if (days[i] <= maxDay) {
            count++;
        } else {
            result.push(count);
            count = 1;
            maxDay = days[i];
        }
    }
    
    result.push(count);
    return result;
}