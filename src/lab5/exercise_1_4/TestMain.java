package exercise_1_4;

public class TestMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("id is: " + employee1.getID());
        System.out.println("first name is: " + employee1.getFirstName());
        System.out.println("lastname is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());

        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);

    }
}
//Employee[id=8,name=PeterTan,salary=2500]
//Employee[id=8,name=PeterTan,salary=999]
//id is: 8
//first name is: Peter
//lastname is: Tan
//salary is: 999
//name is: PeterTan
//annual salary is: 11988
//1098
//Employee[id=8,name=PeterTan,salary=1098]
