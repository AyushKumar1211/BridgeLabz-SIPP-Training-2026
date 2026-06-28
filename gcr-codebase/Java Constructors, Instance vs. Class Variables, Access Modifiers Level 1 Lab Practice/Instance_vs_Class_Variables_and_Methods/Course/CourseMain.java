public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        Course c2 = new Course("Python", 2, 12000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Global IT Institute");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
