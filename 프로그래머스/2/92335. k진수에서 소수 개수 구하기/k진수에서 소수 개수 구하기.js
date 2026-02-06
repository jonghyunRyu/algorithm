function solution(n, k) {
  let answer = 0;

  const isPrime = (num) => {
    if (num < 2) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
      if (num % i === 0) return false;
    }
    return true;
  };

  const changeNum = n.toString(k);
  let makeNum = '';

  for (const num of changeNum) {
    if (num === '0') {
      if (makeNum !== '') {
        const parseNum = Number(makeNum);
        if (isPrime(parseNum)) answer++;
        makeNum = '';
      }
    } else {
      makeNum += num;
    }
  }

  if (makeNum !== '' && isPrime(Number(makeNum))) {
    answer++;
  }

  return answer;
}