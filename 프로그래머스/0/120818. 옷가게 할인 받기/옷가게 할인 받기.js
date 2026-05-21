function solution(price) {
    
    if (price >= 500_000) {
        return Math.floor(price * 4 / 5);
    } else if (price >= 300_000) {
        return Math.floor(price * 9 / 10);
    } else if (price >= 100_000) {
        return Math.floor(price * 19 / 20);
    } else {
        return price;
    }
}