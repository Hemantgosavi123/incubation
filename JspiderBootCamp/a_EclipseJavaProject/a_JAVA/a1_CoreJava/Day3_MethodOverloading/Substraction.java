package Day3_MethodOverloading;

class Substraction{
    public static int sub(int a, int b, int c, int d){
        int e = a-b-c-d;
        return e;
    }

    public static void main(String args[])
    {
        int result = sub(10,2,2,2);
        System.out.println(result);
    }
}