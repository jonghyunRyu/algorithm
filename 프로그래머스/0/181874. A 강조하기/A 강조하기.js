function solution(myString) {

    return [...myString].map(v => {
        if (v === 'a' || v === 'A') return 'A';
        else return v.toLowerCase();
    }).join('');
}