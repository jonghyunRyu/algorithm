function solution(n, control) {
    const con = {
        'w' : 1,
        's' : -1,
        'd' : 10,
        'a' : -10
    };
    
    return [...control].reduce((a, v) => a + con[v], n);
}