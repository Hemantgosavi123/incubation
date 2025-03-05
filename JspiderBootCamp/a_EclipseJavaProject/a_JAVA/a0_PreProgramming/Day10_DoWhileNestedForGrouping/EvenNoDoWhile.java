package Day10_DoWhileNestedForGrouping;

class EvenNoDoWhile {
    public static void main(String args[])
    {
        int a = 1;

        do{
            if(a%2==0)
            {
                System.out.println(a);
            }
            a++;
        }while(a<=50);
    }
}

