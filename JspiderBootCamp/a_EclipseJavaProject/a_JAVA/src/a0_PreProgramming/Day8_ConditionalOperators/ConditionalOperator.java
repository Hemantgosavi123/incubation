package a0_PreProgramming.Day8_ConditionalOperators;

class ConditionalOperator {


    public static String evenOdd(int e)
    {
        String EvenOddResult = (e%2==0)? "even":"odd";
        return EvenOddResult;
    }
    public static void main(String args[])
    {
        int a = 11;
        int b = 15;
        int c = a+b;
        boolean Greater = (a++ < b && c>a);
        System.out.println("Value of variable C is ="+c);
        System.out.println("Result of Greater is ="+Greater);


        int e=23;
        System.out.println("In EvenOdd Program  '"+e+ "' Number is ="+evenOdd(e));

        String myself= "reach";
        String brother ="poor";
        String FamilyBackground = (brother=="reach" || myself=="reach")?"reach":"poor";
        System.out.println("The Family Background is = "+FamilyBackground);



    }

}


