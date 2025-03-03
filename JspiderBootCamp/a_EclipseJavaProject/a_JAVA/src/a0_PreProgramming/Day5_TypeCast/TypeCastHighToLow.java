package a0_PreProgramming.Day5_TypeCast;

//Type Cast from higher data type to lower lower data type

class TypeCastHighToLow {
  public static void main(String args[])
  {
      double a =  200.67674545d;
      float b = (float)a; 	//explicitely we can convert higher data type into lower datatype so data can corrpt
      long c = (long)a;
      int d = (int)a;
      char f = (char)a;
      short e = (short)a;
      
      //boolean g = (boolean)a;  Can not type cast Boolean data



      System.out.println("double Value       = "+a);
      System.out.println("converted to float = "+b);
      System.out.println("converted to long  = "+c);
      System.out.println("converted to int  = "+d);
      System.out.println("converted to char  = "+f);
      System.out.println("converted to short  = "+e);
      //System.out.println("converted to boolean  = "+g);
      
      

      
      //     char a ='a';
  //     int b =(int)a;
  //    // boolean x= true;
  //     //byte y=(byte)x;
  //     System.out.println(b);
  //     //System.out.println(y);
  }
  
}
