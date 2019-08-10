public int binarySearch(int[] a, int search) {
    return binarySearch(a, search, 0, a.length - 1);
}
public int binarySearch(int[] a, int search, int begin, int end) {
    int middle = begin + (end - begin) / 2;
    if (a[middle] == search)
        return middle;
    else if (begin >= end)
        return -1;
    else if (search > a[middle])
        return binarySearch(a, search, middle + 1,  end);  
    else
        return binarySearch(a, search, begin ,  middle - 1);
}
