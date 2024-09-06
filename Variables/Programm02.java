public class Programm02 {
    int age = 44;
    static int var1 = 34;

    int a ;
    static int v;
    String name ;

    public static void main(String[] args) {
        Programm02 obj = new Programm02();

        System.out.println(obj.a);
        System.out.println(obj.v);
        System.out.println(obj.name);

        System.out.println(obj.age);

        System.out.println(obj.var1);


        obj.age = 55; //override
        obj.var1 = 21; //override

        System.out.println(obj.age);
        System.out.println(obj.var1);

        obj.var1 = 10;
        System.out.println(obj.var1);
        

        Programm02 obj2 = new Programm02();

        System.out.println(obj2.age); 
        System.out.println(obj2.var1);

        System.out.println(Programm02.var1);
    }
}
