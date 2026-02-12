package beginner.bit_manipulation.problems;

public class CountSetBits {
    public static void main(String[] args) {
        int n = -45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));
    }

    static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n - 1);
            // n -= n & -n;
        }

        return count;
    }
}
