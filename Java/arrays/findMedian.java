public int findMedian(int[] arr) {
    Arrays.sort(arr);
    if (arr.length % 2 != 2)
        return arr[arr.length/2];
    return (arr[arr.length/2] + arr[arr.length/2 - 1]) / 2;
}
