//  https://www.codestepbystep.com/problem/view/java/recursion/countToBy
public void countToBy(int end, int amount) {
    if (end <= 0 || amount <= 0)
        throw new IllegalArgumentException();
    if (end <= amount) {
        System.out.print(end);
    } else {
        countToBy(end - amount, amount);
        System.out.print(", " + end);
    }
}
