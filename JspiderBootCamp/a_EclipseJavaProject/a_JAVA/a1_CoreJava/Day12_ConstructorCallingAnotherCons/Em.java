package Day12_ConstructorCallingAnotherCons;

class Em
{
   int emp_id;
   String emp_name;
   double emp_sallary;
   
   Em()      //No-Argument Constructor
   {  
       System.out.println("Hiee hemant");
       System.out.println("Passed From No Formal argument constructor");
   
   }

   Em(int emp_id)        //One Parameterized Constructor
   {   
       this();
       this.emp_id=emp_id;
       
       System.out.println("Passed from One Formal argument constructor");
   }

   Em(int emp_id,String emp_name)        //One Parameterized Constructor
   { 
       this(emp_id);
       this.emp_name=emp_name;
       
       System.out.println("Passed from Two Formal argument constructor");
   }
   Em(int emp_id,String emp_name,double emp_sallary)        //One Parameterized Constructor
   { 
       this(emp_id,emp_name);
       this.emp_sallary=emp_sallary;
       System.out.println("Passed from Three Formal argument constructor");
   }

   public static void main(String args[])
   {
       Em ref = new Em(1,"Hemu",24);
       System.out.println(ref.emp_id);
       System.out.println(ref.emp_name);
       System.out.println(ref.emp_sallary);

       System.out.println("====================================");
       
}
}
