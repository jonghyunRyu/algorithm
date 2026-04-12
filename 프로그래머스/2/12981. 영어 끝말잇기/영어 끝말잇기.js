function solution(n, words) {
  let answer = [0, 0];

  for (let i = 1; i < words.length; i++) {
      let check = words[i-1];
      let word = words[i];
      
      if (check.charAt(check.length-1) !== word.charAt(0) || words.indexOf(word) < i) {
          answer[0] = i % n + 1;
          answer[1] = Math.ceil((i + 1)/ n);
          break;
      }
  }

  return answer;
}