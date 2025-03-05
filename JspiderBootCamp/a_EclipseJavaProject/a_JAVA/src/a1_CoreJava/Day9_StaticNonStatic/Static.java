package a1_CoreJava.Day9_StaticNonStatic;

class Static {
    static String username;

    public static void main(String args[])
    {
        Static InstaUser1 = new Static();	//here you creating Object to store Casper
        InstaUser1.username = "Casper_gosavi";

        Static InstaUser2 = new Static();	//here you creating Object to store Hemant
        InstaUser2.username = "Hemant_gosavi";

        Static InstaUser3 = new Static();	//here you creating Object to store Priyanka
        InstaUser3.username ="Priyanka";
        
        //But actually there is no any variable inside heap area to store name
        //so you are storing name inside static area which is same as you arr replacing names on static variable

        System.out.println("Username is "+InstaUser1.username);  //Username is Priyanka
        System.out.println("Username is "+InstaUser2.username);  //Username is Priyanka
        System.out.println("Username is "+InstaUser3.username);  //Username is Priyanka
    }
}

