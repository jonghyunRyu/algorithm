function solution(name, yearning, photo) {
    const answer = photo.map(p => 
        p.reduce((a, v) => {
            if (name.includes(v)) {
                return a + yearning[name.indexOf(v)];
            } else {
                return a;
            }
    }, 0));
    
    return answer;
}