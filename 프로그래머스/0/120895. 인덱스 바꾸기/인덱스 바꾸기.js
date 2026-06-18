function solution(my_string, num1, num2) {
    
    const str1 = my_string[num1];
    const arr = [...my_string];
    
    arr[num1] = arr[num2];
    arr[num2] = str1;
        
    return arr.join('');
}