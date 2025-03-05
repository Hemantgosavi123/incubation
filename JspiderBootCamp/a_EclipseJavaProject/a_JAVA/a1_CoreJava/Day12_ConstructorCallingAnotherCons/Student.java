package Day12_ConstructorCallingAnotherCons;

class Student {
    int Student_id ;
    String name;
    double Student_percentage;
    
    Student(int Student_id,String name,double Student_percentage)
    {
        this.Student_id=Student_id;
        this.name = name;
        this.Student_percentage=Student_percentage;
        System.out.println("Student Id is = "+this.Student_id);
        System.out.println("Student name is = "+this.name);
        System.out.println("Student Percentage is = "+this.Student_percentage);

        System.out.println();
    }
    public static void main(String args[])
    {
        Student ref=new Student(1,"Hemant",99.9);
        

        Student ref1=new Student(2,"Casper",98.9);
        

         Student ref2=new Student(3,"Sudesh",98.9);
        
         
    }
}
