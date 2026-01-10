package beginner;


public class Step0 {
    static void q1() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }

    static void q2() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }

    static void q3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= (row + 1); col++) {
                System.out.print(row + 1);
            }
            System.out.println();
        }
    }

    static void q4(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char) (row + 'A'));
            }
            System.out.println();
        }
    }

    static void q5(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char) ('A' + row + col));
            }
            System.out.println();
        }
    }

    static void q6(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char) ('A' + n - row + col - 1));
            }
            System.out.println();
        }
    }

    static void q7(int n) {
        for (int row = 0; row < n; row++) {
            // print spaces
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("*");
            }

            // print numbers
            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1);
            }

            // new line
            System.out.println();
        }
    }

    static void q8(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void q9(int n) {
        for (int row = 0; row < n; row++) {
            // print spaces
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            // print first pattern
            for (int col = 0; col <= row; col++) {
                System.out.print(row + col + 1);
            }

            // print last  pattern
            for (int col = 0; col < row; col++) {
                System.out.print((row * 2) - col);
            }

            // new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row < n * 2; row++) {
            int totalColsPerRow = row > n ? n * 2 - row : row;
            for (int col = 1; col <= totalColsPerRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
//        for (int row = 1; row < n*2; row++) {
//            int spacesPerRow = row > n ? row - n : n - row;
//            for (int space = 1; space <= spacesPerRow; space++) {
//                System.out.print(" ");
//            }
//
//            int starsPerRow = row > n ? n * 2 - row : row;
//            for (int star = 1; star <= starsPerRow; star++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        for (int row = 1; row < n * 2; row++) {
            int starsPerRow = row > n ? n * 2 - row : row;

            for (int space = 1; space <= n - starsPerRow; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= starsPerRow; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // print first pattern
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }

            for (int num = 2; num <= row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        int totalRows = n * 2 - 1;
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalRows; col++) {
                int value = Math.min(Math.min(row, col), Math.min(totalRows - col - 1, totalRows - row - 1)) + 1;
                System.out.print((n - value + 1) + " ");
            }
            System.out.println();
        }
    }

    static void q11(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void q12(int n) {
        int sum = 0;
        for (int row = 1; row <= n; row++) {
            sum += row;

            // print the integers from 1 to row separated by "+"
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
                if (col < row) {
                    System.out.print("+");
                }
            }
            System.out.println("=" + sum);
        }
    }

    static void q13(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void q14(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                boolean shouldPrintStar = row == 0 || col == 0 || col == (n - row - 1);
                System.out.print(shouldPrintStar ? "*" : " ");
            }
            System.out.println();
        }
    }

    static void q15(int n) {
        for (int row = 0; row < n; row++) {
            int startNum = 2 * row + 1;
            for (int col = 0; col < n; col++) {
                System.out.print(startNum % (n * 2) + " ");
                startNum += 2;
            }
            System.out.println();
        }
    }

    // https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    public static void main(String[] args) {
        q15(4);
    }
}