public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater: " + (a > b));
        System.out.println("Less: " + (a < b));

        System.out.println("Logical AND: " + (a > 0 && b > 0));
        System.out.println("Logical OR: " + (a > 0 || b < 0));
        System.out.println("Logical NOT: " + !(a > b));

        int x = 5;
        x++;
        System.out.println("Increment: " + x);
        x--;
        System.out.println("Decrement: " + x);

        int y = (a > b) ? a : b;
        System.out.println("Ternary Result: " + y);
    }
}
