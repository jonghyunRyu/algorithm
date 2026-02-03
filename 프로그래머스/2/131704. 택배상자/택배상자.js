function solution(order) {
    let stack = [];
    let next = 1;
    let answer = 0;

    for (let i = 0; i < order.length; i++) {
        const target = order[i];

        while (
            next <= order.length &&
            (stack.length === 0 || stack[stack.length - 1] !== target)
        ) {
            stack.push(next);
            next++;
        }

        if (stack[stack.length - 1] === target) {
            stack.pop();
            answer++;
        } else {
            break;
        }
    }

    return answer;
}