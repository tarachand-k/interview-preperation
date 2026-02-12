package beginner.bit_manipulation;

public class BitManipulation {
    public static void main(String[] args) {
//        int[] arr = {4, 2, 3, 4, 3, 2, 5};
//        System.out.println(findUnique(arr));
//        System.out.println(isEven(33));

        System.out.println(findIthBit(54, 4));
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    static int findIthBit(int num, int i) {
        // return (num >> i) & 1;

        int mask = 1 << i - 1;

        return (num & mask) > 0 ? 1 : 0;

    }
}
