package SingleResponsabilityOption1;

/**
 *  Employee class
 *  Responsability does not mean Function
 */
public class Employee {
    String name;

    // CFO responsible when sees an anomaly on payroll
    double calcPay(){
        return 10;
    };

    // COO responsible when sees an anomaly on reported activities
    String ReportHours(){
        return "activities by hour";
    };

    // CTO responsible when sees that a corruption on Database
    Employee updateEmployee(Long id, Employee employee){
        //persist employee
        System.out.println("employee updated:" + employee);
        return employee;
    };
}
