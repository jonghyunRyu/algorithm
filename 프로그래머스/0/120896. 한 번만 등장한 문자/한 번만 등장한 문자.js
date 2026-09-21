function solution(s) {
    const count = {};

    for (const char of s) {
        count[char] = (count[char] || 0) + 1;
    }

    const result = [];

    for (const char in count) {
        if (count[char] === 1) {
            result.push(char);
        }
    }

    return result.sort().join('');
}