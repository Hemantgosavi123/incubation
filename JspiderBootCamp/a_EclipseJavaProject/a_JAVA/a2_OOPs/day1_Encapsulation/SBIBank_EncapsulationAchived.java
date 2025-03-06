package day1_Encapsulation;

class SBIBank_EncapsulationAchived {
        public static void main(String args[]){
                ATMMachine ref = new ATMMachine();
                // System.out.println(ref.money);	//Directly you can't access private  variable
                System.out.println("You have balance of "+ref.getMoney() + " Rs."); //you can use getter method to access private variable
                double balance=ref.getMoney();
                double withrawAmount=5000;
                System.out.println(withrawAmount+" Ammount is withdrawing...");
                
                if(balance>=withrawAmount) {
                	ref.setMoney(balance-withrawAmount); //you can use setter method to set value for private variable
                }else {
                	System.out.println("You don't have sufficient balance");
                }
                
                 System.out.println("Current Balance = "+ref.getMoney());
                
                //this we called :Data Hiding :  process of avoiding direct access but providing control access
        }    
}

class ATMMachine{
    private double money = 30000; //using private access specifier we can achiving data hiding

    
	public double getMoney(){		
	    return this.money;	//using this method we can get variable "money" in other class
	}
	public void setMoney(double money){	//using this method we can get variable "money" in other class
		withdraw();
	    this.money = money;
	
	}

    public void withdraw(){
        System.out.println(" Transaction is Processing....");
    }
}
