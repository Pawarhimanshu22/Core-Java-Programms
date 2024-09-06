class TypesOfVariable
{
    int var1 = 39; //instance variable
    
    static int var2 = 55; // static variable

    public void add()
    {
        int var3 = 45; //Local variable
        int res = var1 + var2 + var3;
        System.out.println(res);
    }

    public void mul()
    {
        int var4 = 88; // local variable 
        int var3 = 88; // local variable
        int res1 = var1 * var2 * var3 * var4;
        System.out.println(res1);
    }
    public static void main(String[] args) {
        int age = 30; // Local variabl
        System.out.println(age);
        
        TypesOfVariable obj = new TypesOfVariable();
        obj.add();
        obj.mul();
    }
}