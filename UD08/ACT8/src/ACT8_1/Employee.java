package ACT8_1;
import java.text.NumberFormat;
/**
 *
 * @author alumnat
 */
public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;
    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    public static void main(String[] args) {
        try{
            EmployeeStockPlan employeeStock = new EmployeeStockPlan();
            Employee employee1 = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27);
            Engineer engineer1 = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
            Manager manager1 = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
            Admin admin1 = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
            Director director1 = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
            employee1.raiseSalary(100);
            employee1.setName("Nignog");
            employee1.printEmployee(employee1, employeeStock);//Employee.printEmployee(employee1); normalmente si se usa un main separado.
            employee1.printEmployee(engineer1, employeeStock);
            employee1.printEmployee(manager1, employeeStock);
            employee1.printEmployee(admin1, employeeStock);
            employee1.printEmployee(director1, employeeStock);
            manager1.addEmployee(employee1);
            manager1.printStaffDetails();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    /**
     * Incrementa el salario de un empleado, no puede bajar el salario.
     * @param increase incrementa el salario en ese número si es positivo.
     */
    public void raiseSalary(double increase){
        if(increase > 0){
            salary += increase;
        }
    }
    /**
     * Muestra los datos de un empleado
     * @param employee
     */
    public void printEmployee(Employee employee){
        //System.out.println(employee.getEmpId() + " " + employee.getName() + " " + employee.getSsn() + " " + employee.getSalary());
        System.out.println("Employee Type: " + employee.getClass().getSimpleName());
        System.out.println(employee.toString());
    }    
    public void printEmployee(Employee employee, EmployeeStockPlan employeeStock){
        printEmployee(employee);
        System.out.println("Stock Options: " + employeeStock.grantStock(employee));
    }
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setName(String name){
        if(name != null && name != ""){
            this.name = name;
        }
    }
    @Override
    public String toString(){
        String text;
        return "Employee ID: " + getEmpId() + "\n" +
               "Employee Name: " + getName() + "\n" +
               "Employee SSN: " + getSsn() + "\n" +
               "Employee Salary: " + NumberFormat.getCurrencyInstance().format(getSalary());
    }
}