public class UtilityMethods {

        // 1. Check if a number is even
        public static boolean isEven(int number) {
            return number % 2 == 0;
        }

        // 2. Find the maximum of two numbers
        public static int max(int a, int b) {
            return (a > b) ? a : b;
        }

        // 3. Reverse a string
        public static String reverseString(String text) {
            StringBuilder reversed = new StringBuilder(text);
            return reversed.reverse().toString();
        }

        // 4. Calculate the square of a number
        public static int square(int number) {
            return number * number;
        }

        // 5. Check if a string is empty or null
        public static boolean isNullOrEmpty(String text) {
            return text == null || text.isEmpty();
        }

        // Main method for testing
        public static void main(String[] args) {
            System.out.println(isEven(10));
            System.out.println(max(5, 9));
            System.out.println(reverseString("Java"));
            System.out.println(square(6));
            System.out.println(isNullOrEmpty("Ramesh"));
        }
}

