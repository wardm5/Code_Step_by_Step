//  Write a complete C++ program with a main function that computes who won the Stanford-Berkeley football game. The program should ask the user for the two scores. 
//  You may assume that the user enters valid non-negative integers. 

int main() {
    int stan = 0;
    int cal = 0;
    cout << "Stanford: How many points did they score? ";
    cin >> stan;
    cout << "Cal: How many points did they score? ";
    cin >> cal;
    if (cal < stan) {
        cout << "Stanford won!" ;
    } else { 
        cout << "Cal won!" ;
    }
    return 0;
}
