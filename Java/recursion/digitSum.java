public int digitSum(int val) {
    if (val == 0)
        return 0;
    else 
        return digitSum(val/10) + val%10;
}
