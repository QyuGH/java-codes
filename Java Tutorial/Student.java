class Student extends Person{
    public String course;
    public int grade;

    public Student(String name, int age, int grade, String course){
        super(name, age);
        this.grade = grade;
        this.course = course;
    }

    @Override
    public void viewInfo(){
        super.viewInfo();
        System.out.println("Grade: " + grade);
        System.out.println("Course: " + course);
    }
}
