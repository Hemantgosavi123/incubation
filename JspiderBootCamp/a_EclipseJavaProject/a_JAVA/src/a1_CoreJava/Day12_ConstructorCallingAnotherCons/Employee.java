package a1_CoreJava.Day12_ConstructorCallingAnotherCons;

class Employee {
    int emp_id;
    String emp_name;
    double emp_sallary;
    
    Employee()      //No-Argument Constructor
    {  
        System.out.println("I am No Formal argument constructor");
    }

    Employee(int emp_id)        //One Parameterized Constructor
    { 
    	this();
        this.emp_id=emp_id;
        System.out.println("I am One Formal argument constructor");
    }

    Employee(int emp_id,String emp_name)       //Two Parameterized Constructor
    {   
    	this(emp_id);
        this.emp_name=emp_name;
        System.out.println("I am Two Formal argument constructor");
    }

    Employee(int emp_id,String emp_name,double emp_sallary) //Three Parameterised Constructor
    {  
    	this(emp_id,emp_name);
        this.emp_sallary=emp_sallary;
        System.out.println("I am Three Formal argument constructor");
    }
    

    public static void main(String args[])
    {
        Employee ref = new Employee();
        System.out.println("No FA="+ref.emp_id);
        System.out.println("No FA="+ref.emp_name);
        System.out.println("No 2FA="+ref.emp_sallary);

        System.out.println("====================================");
        
        Employee ref1 = new Employee(1);
        System.out.println("1 FA="+ref1.emp_id);
        System.out.println("1 FA="+ref1.emp_name);
        System.out.println("1 FA="+ref1.emp_sallary);

         System.out.println("====================================");
    
        Employee ref2 = new Employee(2,"Raju");
        System.out.println("2 FA="+ref2.emp_id);
        System.out.println("2 FA="+ref2.emp_name);
        System.out.println("2 FA="+ref2.emp_sallary);

         System.out.println("====================================");
            
    
        Employee ref3 = new Employee(3,"Suresh",400000.500);
        System.out.println("3 FA="+ref3.emp_id);
        System.out.println("3 FA="+ref3.emp_name);
        System.out.println("3 FA="+ref3.emp_sallary);

    }
    


}
