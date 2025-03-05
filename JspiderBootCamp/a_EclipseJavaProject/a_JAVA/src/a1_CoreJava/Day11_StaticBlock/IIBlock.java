package a1_CoreJava.Day11_StaticBlock;

class IIBlock {
    int a = 10;     //Non Static Variable
    static int b=5;
    
    {   //IIB - Instance Initializer block
        System.out.println(b);
        System.out.println("Calling a in Non static block ="+a);
        nonStatic();
    }

    static
    {
        // System.out.println("Inside static block calling non static var"+ref.a);   
    	System.out.println("We can not call Nonstatic var");
    }

    public void nonStatic()
    {
        System.out.println("Hiee");
        System.out.println("Calling a In non static method"+this.a);
        System.out.println("Byee");

    }
    public static void main(String args[]) {
    	System.out.println("Without creating object the Instance initiallizer block will not executes");
    }
}