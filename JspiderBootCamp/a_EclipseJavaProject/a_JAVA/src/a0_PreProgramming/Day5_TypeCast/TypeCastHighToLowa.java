package a0_PreProgramming.Day5_TypeCast;

class TypeCastHighToLowa {
    public static void main(String args[])
    {
        boolean a = true;
        //char b = a; //Can not convert Boolean to any type

        char x = 'A';
        //short p =x; // It will give error because char is gretter than short
        int q=x;
        long r = x;
        // float s = x;
        double t = x;
        
        float s=(float)t;
        
        //Internally java can not change higher data type into lower data type

        

        System.out.println("For Boolean Type"+a);
        //System.out.println("Original Type"+b);
        //System.out.println("Char converted to Short = " +p);
        System.out.println("Char converted to int = " +q);
        System.out.println("Char converted to long = " +r);
        System.out.println("Char converted to float= " +s);
        System.out.println("Char converted to double = " +t);
    }
}
