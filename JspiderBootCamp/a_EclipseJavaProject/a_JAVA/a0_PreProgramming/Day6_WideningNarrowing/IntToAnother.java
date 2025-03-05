package Day6_WideningNarrowing;

//Write java program to store int value into byte.short,long,float, double, charn type variable
class IntToAnother {
  public static void main(String args[])
  {
      int a = 10;
      byte b =(byte)a;
      short c = (short)a;
      long d = (short)a;
      float e = (float)a;
      double f = (double)a;
      char g= (char)a;

      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);
      System.out.println("g not printing anything"+g);
      
  }
}
