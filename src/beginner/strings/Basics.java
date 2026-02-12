package beginner.strings;

public class Basics {
    public static void main(String[] args) {
//        // Creating String in String Pool
//        String name1 = "Tarachand";
//        String name2 = "Tarachand";
//
//        // Comparison
//
//        System.out.println(name1 == name2);
//
//        String name3 = name1;
//
//        System.out.println(name3 == name1);
//
//        // Creating new String object irrespective of optimization
//        String name4 = new String("Tarachand");
//        System.out.println(name4 == name2);
//
//        System.out.println('a' + "a");
//
//        // PERFORMANCE
//
//        //  Immutable => O(n^2)
//        String series = "";
//        for (int i = 0; i < 26; i++) {
//            series += (char) ('a' + i);
//        }
//
//        System.out.println(series);
//
//        // Mutable => O(n)
//        StringBuilder series2 = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            series2.append((char) ('a' + i));
//        }
//        System.out.println(series2);
        System.out.println(isPalindrome("abcdba"));
    }

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
