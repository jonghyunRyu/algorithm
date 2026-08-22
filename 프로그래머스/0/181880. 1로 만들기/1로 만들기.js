function solution(num_list) {

    function div(num) {

        let cnt = 0;

        while (num > 1) {
            if (num % 2 === 0) {
                num /= 2;
                cnt++;
            } else {
                num = (num - 1) / 2;
                cnt++;
            }
        }

        return cnt;
    }
    
    return num_list.reduce((a, v) => a + div(v), 0);
}