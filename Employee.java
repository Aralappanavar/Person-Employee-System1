public class Employee extends Person{
    private int emp_id;
    private double salary;
    public Employee(String name,String dob,int age,int emp_id,double salary){
        super(name, dob, age);
        this.emp_id=emp_id;
        this.salary=salary;
    }
    public void printEmployeeDetails(){
        printDetails();
        System.out.println("emp_id :"+emp_id);
        System.out.println("salary :"+salary);
    }
    public static void main(String[] args) {
        Employee e1=new Employee("Ram", "01-01-2000", 25, 1, 40000);
        e1.printEmployeeDetails();
    }
    
}
