function solution(my_string, is_prefix) {
    
    for (let i = 0; i < is_prefix.length; i++) {
        if (is_prefix[i] !== my_string[i]) return 0;
    }
    
    return 1;
}