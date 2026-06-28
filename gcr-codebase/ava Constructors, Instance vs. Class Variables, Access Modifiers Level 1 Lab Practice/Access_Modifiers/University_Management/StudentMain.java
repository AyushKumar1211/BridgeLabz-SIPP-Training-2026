public class StudentMain {
    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(101, "Riya", 8.7, "Computer Science");
        p.display();
        p.setCGPA(9.1);
        p.display();
    }
}
