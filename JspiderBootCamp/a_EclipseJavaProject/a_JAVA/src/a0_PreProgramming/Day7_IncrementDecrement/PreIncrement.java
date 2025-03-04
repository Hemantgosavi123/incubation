package a0_PreProgramming.Day7_IncrementDecrement;
class PreIncrement {

    public static void main(String args[])
    {
        int a = 15;
        int b= 20;
        int c = ++a + ++b;

       System.out.println( c);
        System.out.println(++c);
       System.out.println( ++b);
       System.out.println(b = c++ + ++b);

    }
    
}
