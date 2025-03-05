package a1_CoreJava.Day13_MultipleClassAccessInOneFile;

class MultipleClass {
    //this class should have driver method otherwise it won't execute.. because file name is MultipleClass
	//so only MultipleClass driver method will execute
	//but in this case tou not provide driver method so program will not executes
}

class AnotherClass
{
		public static void main(String args[])
        {
            System.out.println("Yes We can Create multiple class in Single file");
            System.out.println("But we want to give Driver Class name to file for execution");
            System.out.println("this is also Driver Class");
        }
}

class Demo{
    public static void main(String args[])
        {
            System.out.println("Yes We can Create multiple class in Single file");
            System.out.println("But we want to give Driver Class name to file for execution");
        }
}

