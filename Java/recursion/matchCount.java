public int matchCount(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    int i = 0;
    if (list1.size() < 0 || list2.size() < 0)
        return 1;
    else
        return matchCount(list1, list2, i);
}
private int matchCount(ArrayList<Integer> list1, ArrayList<Integer> list2, int i) {
    if (list1.size() <= i || list2.size() <= i)
        return 0;
    else if (list1.get(i) == list2.get(i))
        return matchCount(list1, list2, i + 1) + 1;
    else 
        return matchCount(list1, list2, i + 1);
}
