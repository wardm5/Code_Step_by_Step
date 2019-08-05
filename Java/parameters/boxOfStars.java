public void boxOfStars(int a, int b) {
    for (int i = 0; i < b; i++) {
        for (int j = 0; j < a; j++) {
            if (i == 0 || i == (b - 1)) {
                System.out.print("*");
            } else if (j == 0 || j == (a - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
