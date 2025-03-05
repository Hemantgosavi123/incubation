package Day8_ObjectMaking;

class Object {

    static int b = 0;
    // Object code = new Object();
    // System.out.println(code);
    
    public static void main(String args[])
    {
       
        car();
    }

    public static void car()
    {
        int a =10;
        System.out.println(a);

        Object farari = new Object();
        System.out.println(farari);

    }
}
