function solution(topping) {
    
    let leftTopping = {};
    let leftCount = [];
    let leftToppCount = 0;
    
    for (let i = 0; i < topping.length; i++) {
        if (!leftTopping[topping[i]]) {
            leftTopping[topping[i]] = true;
            leftToppCount++;
        }
        
        leftCount[i] = leftToppCount;
    }
    
    let rightTopping = {};
    let rightCount = [];
    let rightToppCount = 0;
    
    for (let i = topping.length - 1; i >= 0; i--) {
        if (!rightTopping[topping[i]]) {
            rightTopping[topping[i]] = true;
            rightToppCount++;
        }        
        
        rightCount[i] = rightToppCount;
    }
    
    let answer = 0;
    
    for (let i = 1; i < leftCount.length; i++) {
        if (leftCount[i - 1] === rightCount[i]) {
            answer++;
        }
    }
    
    return answer;
}