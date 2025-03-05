package Day7_IncrementDecrement;

class Post_Example1 {
    public static void main(String args[])
    {
        int a = 75;
        int b = 5;
        int c = a++ + b++;

        System.out.println(b++);
        System.out.println(c);
    }
}
