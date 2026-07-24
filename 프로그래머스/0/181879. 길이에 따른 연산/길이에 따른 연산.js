function solution(num_list) {
    return num_list.length >= 11 
        ? num_list.reduce((a, v) => a + v, 0) 
        : num_list.reduce((a, v) => a * v, 1);
}