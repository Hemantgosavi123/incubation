package Day9_StaticNonStatic;

class NonStatic {

    String username;


    public static void main(String args[])
    {
        NonStatic InstaUser1 = new NonStatic();
        InstaUser1.username = "Casper_gosavi";

        NonStatic InstaUser2 = new NonStatic();
        InstaUser2.username = "Hemant_gosavi";

        NonStatic InstaUser3 = new NonStatic();
        InstaUser3.username ="Priyanka";

        System.out.println("Username is "+InstaUser1.username);
        System.out.println("Username is "+InstaUser2.username);
        System.out.println("Username is "+InstaUser3.username);
    }
    
}