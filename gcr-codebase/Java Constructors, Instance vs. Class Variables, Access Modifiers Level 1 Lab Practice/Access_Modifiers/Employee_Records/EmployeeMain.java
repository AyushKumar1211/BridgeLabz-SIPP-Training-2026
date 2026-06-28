public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Backend Team");
        m.display();
        m.setSalary(80000);
        m.display();
    }
}
