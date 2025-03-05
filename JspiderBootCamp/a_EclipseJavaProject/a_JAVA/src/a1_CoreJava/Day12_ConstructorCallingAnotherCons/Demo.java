package a1_CoreJava.Day12_ConstructorCallingAnotherCons;

class Demo {
    int id;
    String name;
    double sallary;

    Demo()
    {
    	//1)PLI -(Pre-loading Instructions) to load / store Non static Variables / methods inside Object
        //2)IIB-(Instance Initializer Block)
    	//3)UWS-(User Written Statements in constructor)
            System.out.println("Passed from Default Constructor");
            System.out.println("How are uhh??");
    }
    Demo(int id)
    {
            this();
            this.id=id;
            
            System.out.println("Passed From 1 FA Consructor");
    }
    Demo(int id,String name)
    {
            this(id);
            this.name=name;
            
            System.out.println("Passed From 2 FA Consructor");
    }
    Demo(int id,String name,double sallary)
    {
            this(id,name);
            this.sallary=sallary;
            System.out.println("Passed From FA Consructor");
    }

    public static void main(String args[])
    {
        Demo ref = new Demo(23,"Yogita",2300000);
        System.out.println(ref.id);
        System.out.println(ref.name);
        System.out.println(ref.sallary);
    }
}
