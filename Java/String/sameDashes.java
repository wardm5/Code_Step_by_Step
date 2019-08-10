public boolean sameDashes(String s1, String s2) {
    int i = 0;
    if (s1.length() >= s2.length())
        return check(s1, s2);
    else
        return check(s2, s1);
    
}
public boolean check(String s1, String s2) {
    int i = 0;
    while (i < s1.length() && i < s2.length()) {
        if ((s1.charAt(i) == '-' && s2.charAt(i) != '-') || (s2.charAt(i) == '-' && s1.charAt(i) != '-'))
            return false;
        i++;
    }
    while (i < s1.length()) {
        if (s1.charAt(i) == '-')
            return false;
        i++;
    }
    return true;
}
