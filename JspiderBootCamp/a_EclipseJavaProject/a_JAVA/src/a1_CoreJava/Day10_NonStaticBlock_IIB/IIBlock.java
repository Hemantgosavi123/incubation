package a1_CoreJava.Day10_NonStaticBlock_IIB;

class IIBlock {
    int a = 10;     //Non Static Variable
    
    {   
        System.out.println("Calling variable 'a' in Non static block / Instance Initializer Block ="+a);
        nonStatic();
    }

    public void nonStatic()
    {
        System.out.println("Hiee");
        System.out.println("Calling variable 'a' in non static method : "+this.a);
        System.out.println("Byee");

    }



    public static void main(String args[])
    {
        IIBlock ref = new IIBlock(); //IIB will executes once when we create object
//        ref.nonStatic();
    }
}
