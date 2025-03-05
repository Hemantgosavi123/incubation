package Day10_DoWhileNestedForGrouping;

class Grouping {
    public static void main(String []args)
    {
        int a =3;
        
        switch(a)
        {
            case 1:
            case 4:
            case 8: {
                        System.out.println("Sing a Song");
                        break;
                    }

            case 2:
            case 5:
            case 9: {   
                        System.out.println("Dance Please");
                        break;
                    }

            case 3:
            case 6:
            case 7:{
                        System.out.println("Tell a Story");
                        break;
                   }

            default: System.out.println("Enter a number between 1 to 10");
        }
    }
}
