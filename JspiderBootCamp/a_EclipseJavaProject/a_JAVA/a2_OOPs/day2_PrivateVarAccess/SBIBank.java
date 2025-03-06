package day2_PrivateVarAccess;

class ATM {
    private double money=200000;    //State
 
    public void withdraw()   //behaviours
    {
     System.out.println("You can Withdraw your Money");
    }

    public void setMethod(double money)
    {
     this.money=money;
    }
    public double getMethod()
    {
         return this.money;
    }

    
}

class SBIBank{      //Driver Class
 public static void main(String args[])
 {
     ATM ref = new ATM();
     ref.setMethod(28999);        
     System.out.println("Total Cash = "+ref.getMethod());
     ref.withdraw();
 }
}