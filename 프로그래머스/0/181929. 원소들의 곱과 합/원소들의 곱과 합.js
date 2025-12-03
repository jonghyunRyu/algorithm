function solution(num_list) {
    const multi = num_list.reduce((a, v) => a * v, 1);
    const add = Math.pow(num_list.reduce((a, v) => a + v, 0), 2); 
    
    return multi > add ? 0 : 1;
}