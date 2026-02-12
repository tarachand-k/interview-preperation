package beginner.bit_manipulation.problems;

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 4, 3, 2, 5};
        System.out.println(findSingleNumber(arr));
    }

    static int findSingleNumber(int[] arr) {
        int ans = 0;

        for (int num : arr) {
            ans ^= num;
        }

        return ans;
    }
}
