function solution(rsp) {
    const dict = {
        '2' : 0,
        '0' : 5,
        '5' : 2,
    }
    
    return rsp.split('').map(v => dict[v]).join('');
}