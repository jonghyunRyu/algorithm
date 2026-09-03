function solution(strArr) {
    const count = new Map();

    for (const str of strArr) {
        const len = str.length;

        count.set(len, (count.get(len) || 0) + 1);
    }

    return Math.max(...count.values());
}