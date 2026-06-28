function solution(num_list) {
    
    let last_idx = num_list.length - 1;
    const v = num_list[last_idx] > num_list[last_idx - 1] ? 
          num_list[last_idx] - num_list[last_idx - 1] :
          num_list[last_idx] * 2;
    
    return [...num_list, v];
}