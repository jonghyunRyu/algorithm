function solution(myStr) {
    const result = myStr.split(/[abc]/).filter(str => str !== "");

    return result.length === 0 ? ["EMPTY"] : result;
}