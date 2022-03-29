package Inheritance;


import java.math.BigDecimal;

public class Employee extends Person{
    private String employeeTitle;
    private String employer;
    private char employeeGrade;
    private BigDecimal salary;




    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + " " + employeeTitle + " " + employer + " " + employeeGrade + " " +salary;
    }
}
