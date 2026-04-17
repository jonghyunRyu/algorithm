function solution(str1, str2) {
    const newStr1 = str1.toUpperCase();
    const newStr2 = str2.toUpperCase();
    
    const elem1 = [];
    const elem2 = [];
    
    for (let i = 0; i < newStr1.length - 1; i++) {
        const sliceStr1 = newStr1.slice(i, i + 2);
        if (sliceStr1.replace(/[^a-zA-Z]/g, '').length === 2) {
            elem1.push(sliceStr1);
        }

    }
    
    for (let i = 0; i < newStr2.length - 1; i++) {
        const sliceStr2 = newStr2.slice(i, i + 2);
        if (sliceStr2.replace(/[^a-zA-Z]/g, '').length === 2) {
            elem2.push(sliceStr2);
        }
    }
    
    const inter = []; 
    const countMap = new Map();
    for (const str of elem1) {
        countMap.set(str, (countMap.get(str) || 0) + 1);
    }
    
    for (const str of elem2) {
        if (countMap.get(str) > 0) {
            inter.push(str);
            countMap.set(str, countMap.get(str) - 1);
        }
    }
     
    const sum = elem1.concat(elem2);
    
    if (sum.length - inter.length === 0 && inter.length === 0) {
        return 65536;
    } else {
        return Math.floor(inter.length / (sum.length - inter.length) * 65536); 
    }
}