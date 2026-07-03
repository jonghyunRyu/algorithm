function solution(arr1, arr2) {
    if (arr1.length > arr2.length) return 1;
    else if (arr1.length === arr2.length) {
        const arr1_sum = arr1.reduce((a, v) => a + v, 0);
        const arr2_sum = arr2.reduce((a, v) => a + v, 0);

        console.log(arr1_sum, arr2_sum);
        if (arr1_sum === arr2_sum) return 0;
        else if (arr1_sum > arr2_sum) return 1;
        else return -1;
    }
    else return -1;
}