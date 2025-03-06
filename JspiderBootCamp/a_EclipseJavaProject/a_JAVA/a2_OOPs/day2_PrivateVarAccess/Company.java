package day2_PrivateVarAccess;

class Company {
    public static void main(String args[])
    {
        Employee emp1 = new Employee(10,"Siddhu",45000);
        System.out.println("id = "+emp1.emp_id);
        System.out.println("name = "+emp1.emp_name);
        // System.out.println("sal = "+emp1.emp_sal);	//you can not access private variable directly
        System.out.println("sal = "+emp1.getSal()); 	//using getter method you can access the salary

        System.out.println("++++++++++++++++++++++++++++++");

        Employee emp2 = new Employee(11,"Dinu",70000);
        System.out.println("id = "+emp2.emp_id);
        System.out.println("name = "+emp2.emp_name);
        // System.out.println("sal = "+emp2.emp_sal);	//you can not modify private variable directly
        System.out.println("sal = "+emp2.getSal());		//using setter method you can modify the salary

        double i = emp2.getSal()*1.25;	//trying to getting increment in salary
        System.out.println("I = = "+i);
        emp2.setSal(80000);	//modifying salary for emp2 using setter method
        System.out.println("Salary Increment = "+emp2.getSal());
    }    
}

class Employee{
    int emp_id;
    String emp_name;
    private double emp_sal;

    public double getSal() //getter method
    {
        return emp_sal;
    }

    public void setSal(double emp_sal)
    {
        this.emp_sal=emp_sal;
    }

    Employee(int emp_id,String emp_name,double emp_sal)
    {
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_sal=emp_sal;
    }
}

