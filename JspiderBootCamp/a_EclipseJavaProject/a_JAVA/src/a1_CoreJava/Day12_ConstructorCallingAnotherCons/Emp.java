package a1_CoreJava.Day12_ConstructorCallingAnotherCons;

class Emp {
    int emp_id;
    String emp_name;
    double  emp_sallary;
    
    Emp(){
        System.out.println("No-Argument Constructor");
    }
    Emp(int emp_id)
    {   
        this();
        this.emp_id=emp_id;
        System.out.println("1 Formal Argument Constructor");
    }
    Emp(int emp_id,String emp_name)
    {   
        this(emp_id);
        this.emp_name=emp_name;
        System.out.println("2 Formal Argument Constructor");
    }
    Emp(int emp_id,String emp_name,double emp_sallary)
    {
        this(emp_id,emp_name);
        this.emp_sallary=emp_sallary;
        System.out.println("3 Formal Argument Constructor");
    }
    public static void main(String args[])
    {
        Emp ref = new Emp(12,"Leela",25999.9);
        System.out.println("emp id : "+ref.emp_id);
        System.out.println("emp name : "+ref.emp_name);
        System.out.println("Emp Sallary : "+ref.emp_sallary);
    }
}
