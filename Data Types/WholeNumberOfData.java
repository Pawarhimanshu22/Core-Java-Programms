class WholeNumberOfData {
    public static void main(String[] args) {

        // byte data = 20; this is in the range of byte data type
        // byte data = 128; not in a range
        byte data = 100;
        System.out.println(data);
        byte a = 10;
        byte b = 5;
        // byte sum = a+b; by default result "int " me hi store hi honga
        int sum = a + b;
        System.out.println(sum);

        short data1 = 3333;
        // shhort data1 = 32768 ; not in the range of short
        System.out.println(data1);

        int data3 = 262627;
        // int data3 = 2147485648 not in range
        System.out.println(data3);

        long data4 = 76488l;
        long data5 = 79;
        System.out.println(data5);
        System.out.println(data4);

    }
}