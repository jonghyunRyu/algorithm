function solution(dirs) {
    
    const move = {
        'U': [0, 1],
        'D': [0, -1],
        'R': [1, 0],
        'L': [-1, 0]
    };
    
    let x = 5;
    let y = 5;
    const route = new Set();
    
    for (const dir of dirs) {
        let [dx, dy] = move[dir];
        let nx = x + dx;
        let ny = y + dy;
        
        if (nx < 0 || nx > 10 || ny < 0 || ny > 10) {
            continue;
        } else {
            route.add(`${x}${y}${nx}${ny}`);
            route.add(`${nx}${ny}${x}${y}`);
        }
        
        x = nx;
        y = ny;
    }
    
    return route.size / 2;
}