package SingleResponsabilityOption3;

public class EmployeeRepository {
    // CTO responsible when sees that a corruption on Database
    Employee updateEmployee(Long id, Employee employee){
        //persist employee
        System.out.println("employee updated:" + employee);
        return employee;
    };
}
