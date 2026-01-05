import java.util.Arrays;
import java.util.HashSet;

public class UtilityLibrary {

    // === Math Utilities ===
    public static int power(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial not defined for negative numbers");
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // === String Utilities ===
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public static int countVowels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }

    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }
        return result.toString();
    }

    // === Array Utilities ===
    public static int[] sort(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy;
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }

    public static int[] reverseArray(int[] arr) {
        int[] copy = arr.clone();
        for (int i = 0, j = copy.length - 1; i < j; i++, j--) {
            int temp = copy[i];
            copy[i] = copy[j];
            copy[j] = temp;
        }
        return copy;
    }

    // === Main Method for Testing ===
    public static void main(String[] args) {
        System.out.println("=== Math Utilities ===");
        System.out.println("Power(2, 5): " + power(2, 5));
        System.out.println("Factorial(5): " + factorial(5));
        System.out.println("isPrime(29): " + isPrime(29));
        System.out.println("GCD(48, 18): " + gcd(48, 18));

        System.out.println("\n=== String Utilities ===");
        System.out.println("Reverse('hello'): " + reverse("hello"));
        System.out.println("Palindrome('madam'): " + isPalindrome("madam"));
        System.out.println("Count Vowels('education'): " + countVowels("education"));
        System.out.println("Remove Duplicates('programming'): " + removeDuplicates("programming"));

        System.out.println("\n=== Array Utilities ===");
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sort: " + Arrays.toString(sort(arr)));
        System.out.println("Search 9: " + search(arr, 9));
        System.out.println("Find Max: " + findMax(arr));
        System.out.println("Find Min: " + findMin(arr));
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray(arr)));
    }
}
