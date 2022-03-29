package Inheritance;

public class Runner {
    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.setName("anna");
        employee.setEmail("employee@gmail.com");
        employee.setEmployeeTitle("programmer");
        employee.setPhone(24598752);
        employee.setEmployeeGrade('A');
        System.out.println(employee);

    }
}
