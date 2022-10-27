package SingleResponsabiltyOption2;

/**
 *  Employee class
 *  Responsability does not mean Function
 */
public class Employee implements ReportWriter, EmployeeRepository {
    String name;

    // CFO responsible when sees an anomaly on payroll
    double calcPay(){
        return 10;
    };

    // COO responsible when sees an anomaly on reported activities
    public String reportHours(){
        return "activities by hour";
    };

    // CTO responsible when sees that a corruption on Database
    public Employee updateEmployee(Long id, Employee employee){
        //persist employee
        System.out.println("employee updated:" + employee);
        return employee;
    };
}
