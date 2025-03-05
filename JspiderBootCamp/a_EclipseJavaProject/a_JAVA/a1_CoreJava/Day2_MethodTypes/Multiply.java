package Day2_MethodTypes;

class Multiply{
    public static void mul(int a, int b, int c)  //This is parameterised method Because Methods have formal Arguments
    {  
        int d = a*b*c;
        System.out.println(d);
    }

    public static void main(String args[])
    {
        mul(10,2,2);
    }
}