/*
    Write a function named rangeOfNumbers that accepts two integers as parameters and prints as console 
    output the sequence of numbers between the two parameters, separated by commas and spaces. 
    Print an increasing sequence if the first parameter's value is smaller than the second; otherwise,
    print a decreasing sequence.
 */
 
 void rangeOfNumbers(int a, int b) { 
    if (a < b) {
        for (int i = a; i < b; i++) {
            cout << i << ", ";
        }
        cout << b;
    } else {
        for (int i = a; i > b; i--) {
            cout << i << ", ";
        }
        cout << b;
    }
}
