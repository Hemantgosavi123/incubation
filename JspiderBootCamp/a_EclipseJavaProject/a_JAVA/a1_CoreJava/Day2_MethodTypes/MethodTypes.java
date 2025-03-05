package Day2_MethodTypes;

class MethodTypes {

    public static void pooja()  //this is No-Arguments Method because Method does not have any formal Arguments
    {
        System.out.println("Hiee My name is Pooja");
    }

    public static void urmila(int a)  //This is Parameterised Methods because Method have Formal Arguments
    {
        System.out.println("Heyy i am not "+a+"years old....Find new gf for you");
    }
    public static void main(String args[])
    {
        pooja();
        urmila(19);
    }
}
