package exercise1_2;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("Ly", "Hanoi", "Universeity", 2022, 14);
        System.out.println("Student :"
                + "Name is " + student1.getName()
                + " Address is " + student1.getAddress()
                + " Program is " + student1.getProgram()
                + " Year is " + student1.getYear() + ""
                + "Fee is " + student1.getFee());
        Staff staff1 = new Staff("Ly", "Hanoi", "KHTN", 14);
        System.out.println("Student :"
                + "Name is " + staff1.getName()
                + " Address is " + staff1.getAddress()
                + " School is " + staff1.getSchool()
                + "Pay is " + staff1.getPay());
    }
}
