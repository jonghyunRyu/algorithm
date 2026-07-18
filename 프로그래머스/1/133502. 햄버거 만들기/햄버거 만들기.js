function solution(ingredient) {
    const stack = [];
    let answer = 0;

    for (const item of ingredient) {
        stack.push(item);

        if (
            stack.length >= 4 &&
            stack[stack.length - 4] === 1 &&
            stack[stack.length - 3] === 2 &&
            stack[stack.length - 2] === 3 &&
            stack[stack.length - 1] === 1
        ) {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            answer++;
        }
    }

    return answer;
}