public void switchPairs(String[] arr) {
    if (arr.length < 1)
        return;
    int index = 1;
    while (index < arr.length) {
        String a = arr[index - 1];
        String b = arr[index];
        arr[index - 1] = b;
        arr[index] = a;
        index += 2;
    }
}
