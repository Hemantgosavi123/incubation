package a1_CoreJava.Day12_ConstructorCallingAnotherCons;

class Constructor {
    int i;

    Constructor(int i)
    {
        System.out.println(this.i=i);
        System.out.println("this reference from Constructor"+this);
        System.out.println("Constructor");
        
    }


    public static void main(String args[])   
    {
    	Constructor ref=new Constructor(35);
        System.out.println(ref.i);
        System.out.println("reference from Static context"+ref);
    }
}

