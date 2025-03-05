package Day7_ChallengeTpProgram;
class Challenge 
{
    static String name;
    static boolean train;

    public static void mIndicator()
        {
            System.out.println("mIndicator Open");
            System.out.println("name"+name);
            System.out.println("train"+train);
            name = "shakila";
            jSpider();
            System.out.println("mIndicator Close");
        
        }
        static 
        {
            jSpider();
        }
        public static void jSpider()
            {
                System.out.println("java class start");
                name = "sheela";
                train = false;
                System.out.println("name : "+name);
                System.out.println("train : "+train);
                System.out.println("java class end");
            
            }
        public static void main(String[]args)
            {
                System.out.println("Main begins");
                float f=15.5F;
                mIndicator();
                System.out.println("f"+f);
                System.out.println("name"+name);
                System.out.println("train"+train);
                System.out.println("Main ends");

            }
            static
            {
                System.out.println("SIB");
        
            }    
}
