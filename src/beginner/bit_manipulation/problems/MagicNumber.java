package beginner.bit_manipulation.problems;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(nthMagicNumber(5));
    }

    static int nthMagicNumber(int n) {
        int magicNum = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            magicNum += last * base;

            n = n >> 1;
            base = base * 5;
        }

        return magicNum;
    }
}
