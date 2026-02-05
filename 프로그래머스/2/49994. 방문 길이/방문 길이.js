function solution(dirs) {
    let visited = [];
    const chars = ['U', 'D', 'R', 'L'];
    let location = [0, 0];
    
    for (let i = 0; i < dirs.length; i++) {
        
        if (dirs[i] === chars[0]) {
            if (location[1] + 1 > 5) {
                continue;
            } else {
                visited.push([...location, location[0], location[1] + 1].join(''));
                location = [location[0], location[1] + 1];
            }
            
        } else if (dirs[i] === chars[1]) {
            
            if (location[1] - 1 < -5) {
                continue;
            } else {
                visited.push([location[0], location[1] - 1, ...location].join(''));
                location = [location[0], location[1] - 1];
            }
            
        } else if (dirs[i] === chars[2]) {
            
            if (location[0] + 1 > 5) {
                continue;
            } else {
                visited.push([...location, location[0] + 1, location[1]].join(''));
                location = [location[0] + 1, location[1]];
            }
            
        } else {
            
            if (location[0] - 1 < -5) {
                continue;
            } else {
                visited.push([location[0] - 1, location[1], ...location].join(''));
                location = [location[0] - 1, location[1]];
            }
        }
    }
    
    let s = new Set(visited);
    
    return s.size;
}