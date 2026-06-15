function solution(fees, records) {
    
    const answer = [];
    
    const [defaultTime, defaultFee, time, fee] = fees;
    
    const Cars = new Map();
    const totalTimes = new Map();
    
    for (const record of records) {
        const [time, carNumber, type] = record.split(' ');
        
        if (type === 'IN') {
            Cars.set(carNumber, calMinute(time));
        } else {
            const inTime = Cars.get(carNumber);
            const parkingTime = calMinute(time) - inTime;
            
            totalTimes.set(
                carNumber, 
                (totalTimes.get(carNumber) || 0) + parkingTime
            );
            
            Cars.delete(carNumber);
        }
    }
    
    const endTime = calMinute('23:59');
    
    for (const [carNumber, inTime] of Cars) {
        const parkingTime = endTime - inTime;
        
        totalTimes.set(
            carNumber, 
            (totalTimes.get(carNumber) || 0) + parkingTime
        );
    }
    
    // 차량 오름차순 정렬
    const cars = [...totalTimes.keys()].sort();
    
    for (const carNumber of cars) {
        const totalTime = totalTimes.get(carNumber);
        
        let baseFare = defaultFee;
        
        if (totalTime > defaultTime) {
            const extraTime = totalTime - defaultTime;
            
            baseFare += Math.ceil(extraTime / time) * fee;
        }
        
        answer.push(baseFare);
    }
    
    return answer;
}

function calMinute(time) {
    const [hour, minute] = time.split(':').map(Number);
    
    return hour * 60 + minute;
}