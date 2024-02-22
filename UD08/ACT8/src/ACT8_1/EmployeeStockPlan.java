package ACT8_1;
/**
 *
 * @author srhig
 */
public class EmployeeStockPlan {
    private final int EMPLOYEE_SHARES = 10, MANAGER_SHARES = 100, DIRECTOR_SHARES = 1000;
    /**
     * 
     * @param employee
     * @return 
     */
    public int grantStock(Employee employee){
        //Grants stocks based on the employee type.
        if(employee instanceof Director){
            return DIRECTOR_SHARES;
        }
        else if(employee instanceof Manager){
            return MANAGER_SHARES;
        }
        else{
            return EMPLOYEE_SHARES;
        }
    }
}