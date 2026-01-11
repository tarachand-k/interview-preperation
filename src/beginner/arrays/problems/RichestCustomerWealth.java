package beginner.arrays.problems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
 
    }

    static int findRichesCustomerWealth(int[][] customers) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] accounts : customers) {
            int customerWealth = 0;
            for (int balance : accounts) {
                customerWealth += balance;
            }

            if (customerWealth > maxWealth) maxWealth = customerWealth;
        }

        return maxWealth;
    }
}
