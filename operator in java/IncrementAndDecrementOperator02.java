public class IncrementAndDecrementOperator02 {

    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 2;

        a1++; // 11
        System.out.println(a1++);// 11
        System.out.println(a1);// 12

        // in post increment values used for computing the res and thn increment

        System.out.println(a1++ + b1); // 14

        int g = 90;
        int f = 2;
        System.out.println(g--);
        // it is using original value not previous value
        System.out.println(g-- + f); // 91

        int a = 20;
        System.out.println(a);
        a++; // post increment

        System.out.println(a);
        a--; // post decrement

        System.out.println(a);
        a--;
        System.out.println(a);

        int b = 20;
        b++; // Postincrement
        System.out.println(b);
        ++b; // Preincrement
        System.out.println(b);

        b--;
        System.out.println(b);
        --b; // pre decrement

        System.out.println(b);

        int c = 5;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int h = 5;
        int i = ++h;
        System.out.println(h);
        System.out.println(i);

        int x = 5;
        int y = x++ + ++x + --x;
        System.out.println(x);
        System.out.println(y);

        int m = 5;
        int n;
        n = m++ + ++m + ++m + m++ + --m + m--;
        System.out.println(m);
        System.out.println(n);


        // Pre increment - first increase the value and than use 

        // Post Increament - first use the value and than use it

        //Pre Decreament - first decrement the value and than use it

        // Post Decreament - first use the value and than use it

    }
}
