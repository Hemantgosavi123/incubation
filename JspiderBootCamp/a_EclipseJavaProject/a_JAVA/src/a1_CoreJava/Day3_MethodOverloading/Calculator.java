package a1_CoreJava.Day3_MethodOverloading;

class Calculator {
    public static int add(int a, int b)
    {
        int c =a+b;
        return c;
    }

    public static int add(int a, int b, int c)
    {
        int d =a+b+c;
        return d;
    }

    public static int add(int a, int b, int c,int d)
    {
        int f =a+b+c+d;
        return f;
    }

    public static int add(int a, int b, int c,int d,int e)
    {
        int f =a+b+c+d+e;
        return f;
    }

    public static int add(int a, int b, int c,int d,int e,int f)
    {
        int g =a+b+c+d+e+f;
        return g;
    }



    public static void main(String args[])
    {
        int additionOfTwo = add(10,10);
        System.out.println(additionOfTwo);

        int additionOfThree = add(10,10,10);
        System.out.println(additionOfThree);

        int additionOfFour = add(10,10,10,10);
        System.out.println(additionOfFour);

        int additionOfFive = add(10,10,10,10,10);
        System.out.println(additionOfFive);

        int additionOfSix = add(10,10,10,10,10,10);
        System.out.println(additionOfSix);
    }
}
