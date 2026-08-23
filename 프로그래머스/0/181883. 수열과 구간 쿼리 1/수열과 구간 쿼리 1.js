function solution(arr, queries) {
    
   queries.forEach(v => {
        const [s, e] = v;
        for (let i = s; i <= e; i++) {
            arr[i]++;
        }
    });
    
    return arr;
}