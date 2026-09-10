function solution(my_string, s, e) {
    
    const prefix = my_string.slice(0, s);
    const suffix = my_string.slice(e + 1);
    const str = [...my_string.slice(s, e + 1)].reverse().join('');
    
    return prefix + str + suffix;
}
    