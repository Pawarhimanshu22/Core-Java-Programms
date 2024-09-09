public class TernaryOperator07 {
    public static void main(String[] args) {
        int a = 19;
        int b = 20;
        int c = 40;
        int res = (a<b)? a:b;
        System.out.println(res);

        String result = (a<b)? "a is less": "b is less";
        System.out.println(result);

      int num =  (a<b)? (a<c? a:b): (b<c? b:c);
      System.out.println(num);

      int x = 10;
      int y = 20;
      int z = (x>y)? 100:200;
      System.out.println(z);
      int m = (x<y)? 100:200;
      System.out.println(m);
      
      

      if (a<c) {
        if (a<c) {
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
      }
      else{
        if (b<c) {
            System.out.println(b);
        }
        else{
            System.out.println();
        }
       

      }
    }
}
