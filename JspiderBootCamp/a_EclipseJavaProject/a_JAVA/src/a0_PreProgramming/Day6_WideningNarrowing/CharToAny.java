package a0_PreProgramming.Day6_WideningNarrowing;

class CharToAny {
    

    public static void main(String args[])
    {
        char a = 'A';
        short b = (short)a;
        int c = (int)b;
        System.out.println(b);
        System.out.println(c);
    }
}