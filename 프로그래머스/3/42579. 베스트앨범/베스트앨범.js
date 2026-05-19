function solution(genres, plays) {
    
    const answer = [];
    const music = new Map();
    const totalPlay = {};
    
    for (let i = 0; i < genres.length; i++) {
        const genre = genres[i];
        
        if (!music.has(genre)) {
            music.set(genre, [{
                    index: i,
                    play: plays[i],
            }]);
            totalPlay[genre] = plays[i];
        } else {
            const data = music.get(genre);
            
            data.push({
                index: i,
                play: plays[i],
            });
            totalPlay[genre] += plays[i];
        }
    }
    
    const genreOrder = Object.entries(totalPlay).sort((a, b) => b[1] - a[1]);
    
    for (const [genre] of genreOrder) {
        const songs = music.get(genre);
        
        songs.sort((a, b) => {
            if (b.play === a.play) {
                return a.index - b.index;
            }
            
            return b.play - a.play;
        });
        
        answer.push(...songs.slice(0, 2).map(v => v.index));
    }
    
    return answer;
}