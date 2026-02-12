package beginner.bit_manipulation.problems;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, 0, 1, 0, 1, 0, 1, -2};
        System.out.println(findSingleNumber(arr));
    }

    static int findSingleNumber(int[] arr) {
        int singleNum = 0;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) bitCount++;
            }

            if ((bitCount % 3) != 0) {
                singleNum = singleNum | (1 << i);
            }
        }

        return singleNum;
    }
}
