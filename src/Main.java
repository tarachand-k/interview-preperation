
public class Main {
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
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void q4(int n) {
        for (int row = 'A'; row < ('A' + n); row++) {
            for (int col = 0; col <= (row - 'A'); col++) {
                System.out.print((char) row);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        q2();
        q3(6);
        q4(5);
    }
}