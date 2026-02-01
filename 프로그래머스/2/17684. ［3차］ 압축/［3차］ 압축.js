function solution(msg) {
    const answer = [];
    const dict = [];

    for (let i = 0; i < 26; i++) {
        dict.push(String.fromCharCode(65 + i));
    }

    for (let i = 0; i < msg.length; i++) {
        let w = msg[i];
        let j = i + 1;

        while (j <= msg.length && dict.includes(w + msg[j])) {
        w += msg[j];
        j++;
        }

        answer.push(dict.indexOf(w) + 1);
        dict.push(w + msg[j]);

        i += w.length - 1;
    }

    return answer;
}