function solution(num_list) {
    let odd = 0;
    let even = 0;
    
    num_list.forEach((v, i) => {
        i % 2 === 0 ? odd += v : even += v    
    });
    
    return Math.max(odd, even);
}