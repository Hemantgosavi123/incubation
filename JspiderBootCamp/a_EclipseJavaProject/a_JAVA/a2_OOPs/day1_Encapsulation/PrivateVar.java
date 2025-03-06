package day1_Encapsulation;

class PrivateVar{
	
    public static void main(String args[])
    {
        Another ref=new Another();
        
        // System.out.println(ref.money);   //this line will show error
            
    	//in this class we can not access "money" variable directly which is in another class using ref
        //because another class variable is private
        //so now in this example we can say encapsulation we are achieving
        
        ref.Withdraw();
      //you can see methods is public so we can access only that method to use that private variable "money"
      // like this in encapsulation we use getter/setter methods to access or modify the variables 
      //you will get idea in other program
    }
}

class Another{

    private int money = 20;

    public void Withdraw()
    {
        System.out.println("This method is accesable uhh can withdraw");
        System.out.println("Total money is  :  "+money);
    }
}
