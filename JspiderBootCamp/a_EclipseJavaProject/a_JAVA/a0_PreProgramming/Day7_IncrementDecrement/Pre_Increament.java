package Day7_IncrementDecrement;

class Pre_Increament {
    public static void main(String args[])
    {
        int a = 304;
	    int b = 49;
	    int c = 78;
	
	    int d = a + ++b + ++c  + ++a;
	    System.out.println(++a + ++d);
	    System.out.println(++d);
	    System.out.println(a);
	    System.out.println(++b + ++c);
	    System.out.println(++a);
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
    }
}
