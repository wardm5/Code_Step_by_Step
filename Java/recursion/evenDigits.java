public int evenDigits(int val) {
    if (val == 0)
        return 0;
    else 
        return evenDigits(val, 1);
}
public int evenDigits(int val, int mult) {
    if (val == 0)
        return 0;
    else if (val % 2 == 0) 
        return evenDigits(val / 10, mult * 10) + (val % 10) * mult;
    else 
        return evenDigits(val / 10, mult);
}
