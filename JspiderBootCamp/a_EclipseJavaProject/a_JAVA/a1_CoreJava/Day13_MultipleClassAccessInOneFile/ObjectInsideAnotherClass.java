package Day13_MultipleClassAccessInOneFile;

class ObjectInsideAnotherClass {
    public static void main(String args[])
    {
        Test ref = new Test();
        System.out.println("j =" +ref.j); //accesing non-static variable "j" from Test class using reference
        System.out.println("a = "+Test.a); //accessing static variable "a" from Test class using class Name
    }
}

class Test{
    static int a =10;
    int j = 20;

}
class Object{


}
