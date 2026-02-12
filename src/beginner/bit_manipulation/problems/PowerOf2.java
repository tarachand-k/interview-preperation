package beginner.bit_manipulation.problems;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 32;

        boolean isPowerOf2 = (n & (n - 1)) == 0;

        System.out.println(isPowerOf2);
    }
}
