class Employee extends Person{
    public double salary;
    public String hireDate;

    public Employee(String name, int age, double salary, String hireDate){
        super(name, age);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public void viewInfo(){
        super.viewInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
    }
}
