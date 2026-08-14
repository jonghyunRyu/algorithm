function solution(myString) {
    
    return [...myString].map(v => {
        const c = 'l';
        if (c.charCodeAt(0) > v.charCodeAt(0)) return 'l';
        else return v;
    }).join('');
}