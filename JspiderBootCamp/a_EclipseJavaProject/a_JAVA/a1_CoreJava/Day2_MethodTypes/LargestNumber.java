package Day2_MethodTypes;

class LargestNumber
{
        public static void largest(int a, int b, int c)
        {
                if(a>b && a>c)
                {
                    System.out.println("The Largest number is" +a);
                }

                else if(b>c)
                {
                    System.out.println("The Largest number is " +b);
                }

                else 
                    System.out.println("The Largest Number is " +c);
        }
        public static void main(String args[])
        {

            largest(10,30,7);

        }


}