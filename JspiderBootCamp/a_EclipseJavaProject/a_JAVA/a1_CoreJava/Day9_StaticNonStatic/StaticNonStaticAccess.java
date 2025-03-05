package Day9_StaticNonStatic;

class StaticNonStaticAccess {
    static int a = 20;
    int b = 5;
    int c = 10;

    {       //NON-Static Block
        System.out.println("In Non-Static Block we can use Static variable Three ways ===== "+"Directly a="+a+"  By ClassName a ="+StaticNonStaticAccess.a+"  By this keyword a ="+this.a);

        System.out.println();  //this is only for next line

        System.out.println("In Non-Static Block we can use Non-Static variable & method Only Using ===== By this keyword a ="+this.b +"methhod using this.method name");

        System.out.println();   //this is only for next line
        
        this.nonStaticMethod(); //We can access Non Static Method using reference only

        System.out.println();   //this is only for next line
        System.out.println();   //this is only for next line
        System.out.println();   //this is only for next line
    }

    static          //This is Static block
    {
        System.out.println("In Static Block we can use Static variable Two ways ===== "+"Directly a="+a+"  By ClassName SataticNonStaticAccess.a ="+StaticNonStaticAccess.a);

        System.out.println();  //this is only for next line

        System.out.println("In Static Block we can not use non-Static members e.g Variable ,method");  
            
    }


    public void nonStatic1()
    {
        System.out.println("Non Static content can call in static method by object ref");
    }
    public void nonStaticMethod()           //Non static Method
    {
        System.out.println("We can Access Non Static Methods using reference of this only in Non static Block & we can access Non-static Method directly in nonStatic context");
        
    }
    public void nonStaticContext()
    {
        System.out.println("Using Non-Static Context we can use Static variable Three ways ===== "+"Directly a="+a+"  By ClassName a ="+StaticNonStaticAccess.a+"  By reference of this a ="+this.a);
        System.out.println();
        System.out.println("Using Non-Static Context we can use Non-Static variable Two ways ===== "+"Directly a="+b+"  By reference of this a ="+this.a);

        nonStaticMethod();
        System.out.println();
        System.out.println();
        System.out.println();       
    }


    public static void main(String args[])      //Static Context
    {
        StaticNonStaticAccess ref=new StaticNonStaticAccess();
        System.out.println("Using Static Context we can use Static variable Three ways ===== "+"Directly a="+a+"  By ClassName a ="+StaticNonStaticAccess.a+"  By ObjectRef a ="+ref.a);
        System.out.println();
        System.out.println("Using Non-Static Context we can use Non-Static variable Only =====  By ObjectRef a ="+ref.b);
        System.out.println();
        System.out.println();
        ref.nonStatic1();
        System.out.println();   
        
    }

    

}
