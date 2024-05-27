package ACT12_6;

import java.io.Serializable;

/**
 *
 * @author srhig
 */
public class Employee implements Serializable{
    private int employeeId;
    private String firstName, lastName, email, phoneNumber, hireDate, jobTitle;
    private double salary, commissionPct;
    private String departmentName;
    public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate, String jobTitle, double salary, double commissionPct, String departmentName){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.departmentName = departmentName;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobTitle=" + jobTitle + ", salary=" + salary + ", commissionPct=" + commissionPct + ", departmentName=" + departmentName + '}';
    }
    
}