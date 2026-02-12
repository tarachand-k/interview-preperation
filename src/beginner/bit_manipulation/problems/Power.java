package beginner.bit_manipulation.problems;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 8));
    }

    // time complexity = O(log(power))
    static int power(int num, int power) {
        int ans = 1;
        int base = num;
        while (power > 0) {
            if ((power & 1) == 1) ans = ans * base;
            power = power >> 1;
            base = base * base;
        }

        return ans;
    }
}
