public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anton", 20);
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

        Person student1 = new Student("Anton", 19, 90, "BSIT");
        student1.viewInfo();
    }

}
