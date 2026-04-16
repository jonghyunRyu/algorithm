// function solution(s) {
//     let answer = 0;
    
//     let stack = [];
//     let strArr = s.split('');
    
//     for (let i = 0; i < strArr.length; i++) {
//         for (let j = 0; j < strArr.length; j++) {
//             if (stack.length === 0) {
//                 stack.push(strArr[j]);
//             } else {
//                 if (stack[0] === ')' || stack[0] === ']' || stack[0] === '}') break;
//                 if (stack[stack.length - 1] === '(' && strArr[j] !== ')') {
//                     stack.push(strArr[j]);
//                 } else if (stack[stack.length - 1] === '(' && strArr[j] === ')') {
//                     stack.pop();
//                 } else if (stack[stack.length - 1] === '[' && strArr[j] !== ']') {
//                     stack.push(strArr[j]);
//                 } else if (stack[stack.length - 1] === '[' && strArr[j] === ']') {
//                     stack.pop();
//                 } else if (stack[stack.length - 1] === '{' && strArr[j] !== '}') {
//                     stack.push(strArr[j]);
//                 } else if (stack[stack.length - 1] === '{' && strArr[j] === '}') {
//                     stack.pop();
//                 } else {
//                     stack.push(strArr[j]);
//                 }
//             }
//         }
        
//         if (stack.length === 0) answer++;
//         stack = [];
//         const c = strArr.shift();
//         strArr = [...strArr, c];
//     }
    
//     return answer;
// }

function solution(s) {
    if(s.length % 2 === 1) return 0;

    let answer = 0;
    const mapping = { "}" : "{", "]" : "[", ")" : "("};

    for(let i = 0; i < s.length; i++) {
        const stack = [];
        const rotate = s.slice(i) + s.slice(0, i);
        let flag = true;

        for(let j = 0; j < s.length; j++) {
            if(rotate[j] === "[" || rotate[j] === "(" || rotate[j] === "{" )
                stack.push(rotate[j]);
            else {
                const last = stack.pop();
                if(last !== mapping[rotate[j]]) {
                    flag = false
                    break;
                }
            }
        }

        if(flag) answer++;
    }

    return answer;
}