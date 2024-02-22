package ACT8_1;
import java.util.ArrayList;
/**
 *
 * @author alumnat
 */
public class Manager extends Employee{
    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;
    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
    }
    /**
     * 
     * @param staffer
     * @return 
     */
    public int findEmployee(Employee staffer){
        for(int contador = 0; contador < staff.length; contador++){
            if(staffer == staff[contador]){
                return contador;
            }
        }
        return -1;
    }
    /**
     * 
     * @param staffer
     * @return 
     */
    public boolean addEmployee(Employee staffer){
        if(findEmployee(staffer) != -1){
            return false;
        }
        else{
            staff[employeeCount] = staffer;
            employeeCount++;
            return true;
        }
    }
    /**
     * 
     * @param staffer
     * @return 
     */
    public boolean removeEmployee(Employee staffer){
        boolean borrado = false;
        Employee[] nuevoStaff = new Employee[20];
        int copiados = 0;
        for(Employee staffers : staff){
            if(staffer.getEmpId() == staffers.getEmpId()){
                borrado = true;
            }
            else{
                nuevoStaff[copiados] = staffers;
                copiados++;
            }
        }
        if(borrado){
            staff = nuevoStaff;
            employeeCount = copiados;
        }
        return borrado; 
    }
    /**
     * 
     */
    public void printStaffDetails(){
        System.out.println("Manager - " + getName() + " and his staff:");
        for(Employee staffers : staff){
            if (staffers != null){
                System.out.println(staffers.getEmpId() + " " + staffers.getName() + " " + staffers.getSsn() + " " + staffers.getSalary());
                //System.out.println(staffers);                
            }
        }
    }
    public String getDeptName(){
        return deptName;
    }
    @Override
    public String toString(){
        return super.toString() + "\nDepartment: " + getDeptName();
    }
}