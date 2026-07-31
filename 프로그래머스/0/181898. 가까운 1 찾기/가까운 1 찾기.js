function solution(arr, idx) {
    
    const arr1 = arr.slice(idx);
    console.log(arr1);
    
    for (let i = 0; i < arr1.length; i++) {
        if (arr1[i] === 1) return i + idx;
    }
    
    return -1;
}