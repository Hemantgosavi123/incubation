package Day6_GlobalVariables;

//The members declared inside the GLobal area is known as Global members 
//The Variables declared outside the method called Global variavble
//Two types of Global members = Static members  &  Non-static members
//Static members = static variables , static methods , static block/Static Initializer Block(SIB)
class GlobalMembers {
	
  static int i=55;            //Global Variable ( any variable delared outside method )

  static
  {
      System.out.println("SIB- Static initializer block");

  } 
  public static void main(String args[])   //Static Method or Static Context
  {
      int i =25;                  //Local Variable	( Any variable declared inside method )
      System.out.println("Directly from local Area = "+i);
      System.out.println("By Global Area ="+ GlobalMembers.i);
  }
  
}

