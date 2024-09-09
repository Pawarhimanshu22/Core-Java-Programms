public class LogicalOperator05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        boolean result = a == b && a < b && a > b;
        System.out.println(result); // you can direct print in your console.

        boolean result1 = a < b && a <= b && a < c;
        System.out.println(result1);

        boolean result2 = 10 == 10 || 10 < 30;
        System.out.println(result2);

        boolean result3 = 10 < 20 || 10 > 20 || 10 > 30;
        System.out.println(result3);

        int p = 9;
        int q = 10;
        System.out.println(p | q); // This performs a bitwise OR operation. In binary:
        // 9 = 1001
        // 10 = 1010
        // Result: 1011 = 11 in decimal

        System.out.println(p & q); //This performs a bitwise AND operation:
        // 9  = 1001
        // 10 = 1010
        // Result: 1000 = 8 in decimal

        System.out.println(p ^ q); // This performs a bitwise XOR (exclusive OR) operation:
        // 9 = 1001
        // 10 = 1010
        // Result: 0011 = 3 in decimal

        System.out.println(p << 1);
        System.out.println(p << 2);
        // These perform left shift operations on p (9):
        // 9 << 1: 1001 becomes 10010 = 18 in decimal
        // 9 << 2: 1001 becomes 100100 = 36 in decimal

        System.out.println(q >> 1);
        System.out.println(q >> 2);
        // These perform right shift operations on q (10):
        // 10 >> 1: 1010 becomes 0101 = 5 in decimal
        // 10 >> 2: 1010 becomes 0010 = 2 in decimal

    }
}
