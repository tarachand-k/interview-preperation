package beginner.recursion.problems;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(7));
    }

    static int fibonacciNumber(int n) {
        if (n < 2) return n;

        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

}
