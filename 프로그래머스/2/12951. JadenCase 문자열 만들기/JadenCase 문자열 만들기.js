function solution(s) {
    let answer = s.split(' ').reduce((acc, v, i) => {
        let jadenCase = '';
        for (let i = 0; i < v.length; i++) {
            if (i == 0) jadenCase += v.charAt(i).toUpperCase();
            else jadenCase += v.charAt(i).toLowerCase();
        }
        return i === 0 ? acc + jadenCase : acc + " " + jadenCase ;
    }, '');
    
    return answer;
}