//  https://www.codestepbystep.com/problem/view/java/arrays/longestSortedSequence
public int longestSortedSequence(int[] arr) {
    if (arr.length < 1)
        return 0;
    if (arr.length < 2)
        return 1;
    int count = 1;
    int prior = arr[0];
    int max = -1;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] >= prior)
            count++;
        else 
            count = 1;
        if (max < count)
            max = count;
        prior = arr[i];
    }
    return max;
}
