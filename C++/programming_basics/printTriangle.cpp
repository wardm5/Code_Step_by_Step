/*
    Write a function named printTriangle that uses for loops to produce the following output:

    #
    ##
    ###
    ####
    #####
    ######
 */

void printTriangle() {
    for (int i = 0; i <= 5; i++) {
        for (int j = 0; j <= i; j++) {
            cout << "#";
        }
        cout << endl;
    }
}
