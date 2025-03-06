package day1_Encapsulation;

class ATM {
    double money=100000;       //States
    
    
    public void withdraw()      //behaviour
    {
        System.out.println("Machha You can Withdraw the cash");
    }
}

//Driver Class
class SBIBank
{
    public static void main(String args[])
    {
        ATM ref=new ATM();
        System.out.println("Total Amount in ATM = "+ref.money);  //here we can directly access "money" from ATM
        // But actually in encapsulation we have to make private states( variables) then we can say we achieved the encapsulation 
        //on other program you will get idea
        
        if(ref.money>=25000)
        {
            ref.withdraw();
        }   
        else{
            System.out.println("Sorry for inconvinience...ATM has no minimum Balance");
        }    
    }
}