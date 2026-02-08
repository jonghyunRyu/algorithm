function solution(s) {
    let arr = [];
    const letter = s.substring(1, s.length-1);

    let str = '';
    for (let i = 0; i < letter.length; i++) {
        if (letter[i] !== '}') {
            str += letter[i];
        } else {
            arr.push(str.replaceAll(/[{]/g, ''));
            str = '';
        }
    }  
    
    arr.sort((a, b) => a.length - b.length);
    
    let answer = [];
    arr.forEach((a, _) => {
        if (a[0] === ',') {
            answer.push(a.replace(',', '').split(','));
        } else {
            answer.push(a.split(','));
        }
    });

    let result = [];
    result.push(parseInt(answer[0][0]));
    for (let i = 0; i < answer.length - 1; i++) {

    let num = answer[i+1].filter(x => !answer[i].includes(x));
    result.push(parseInt(num[0]));

    }

    return result;
}